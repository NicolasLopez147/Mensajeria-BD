/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.*;

/**
 *
 * @author Juan
 */
public class Conexion {

    public Connection con;

    public Conexion(String nombre) {
        try {
            Class.forName("org.postgresql.Driver");  //loads the driver
        } catch (ClassNotFoundException e) {
            System.out.println("No encontro driver");
        }

        try {
            String url = "jdbc:postgresql://localhost:5432/Ventas";

            con = DriverManager.getConnection(url, "postgres", "1234");

            checkForWarning(con.getWarnings());

            DatabaseMetaData dma = con.getMetaData();

            System.out.println("\nConectado a: " + dma.getURL());

            System.out.println("Driver       "
                    + dma.getDriverName());
            System.out.println("Version      "
                    + dma.getDriverVersion());
            System.out.println("");

        } catch (SQLException ex) {
            System.out.println("\n*** SQLException caught ***\n");

            while (ex != null) {
                System.out.println("SQLState: "
                        + ex.getSQLState());
                System.out.println("Message:  " + ex.getMessage());
                System.out.println("Vendor:   "
                        + ex.getErrorCode());
                ex = ex.getNextException();
                System.out.println("");
            }
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
        }
    }

    private static boolean checkForWarning(SQLWarning warn) throws SQLException {
        boolean rc = false;

        if (warn != null) {
            System.out.println("\n *** Warning ***\n");
            rc = true;
            while (warn != null) {
                System.out.println("SQLState: " + warn.getSQLState());
                System.out.println("Message:  " + warn.getMessage());
                System.out.println("Vendor:   " + warn.getErrorCode());
                System.out.println("");
                warn = warn.getNextWarning();
            }
        }
        return rc;
    }

    public void cerrarConexion() {
        try {
            //Cierra la conexion de la Base de Datos
            con.close();
            System.out.println("Cerrada la conexion con la Base de Datos");
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexion con la Base de datos. \n" + e);
        }
    }
}

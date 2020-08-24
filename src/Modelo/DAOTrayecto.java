/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.Trayecto;
import static Modelo.Conexion.con;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan
 */
public class DAOTrayecto {
      
    public void InsertarTrayecto(){
    Trayecto trayecto = new Trayecto(0, 2, "M", "Veneco", 25, "MIAU");//Instancia de nuevo trayecto
        String sql = "INSERT into trayecto VALUES (?, ?, ?, ?, ?, ?);";
        /*Script de inserción SQL, los signos de interrogación corresponden a
        los valores de cada columna
         */
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, trayecto.getIdentificadorDeServicio());
            ps.setInt(2, trayecto.getIdentificadorDeRuta());
            ps.setString(3, trayecto.getDescripcion());
            ps.setString(4, trayecto.getCalle());
            ps.setInt(5, trayecto.getNumeroDeCalle());
            ps.setString(6, trayecto.getBarrio());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            System.out.println("ok");
        }
}
}

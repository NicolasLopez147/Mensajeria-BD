/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.Estado;
import static Modelo.Conexion.con;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan
 */
public class DAOEstado {

    public void InsertarEstado() {
        Estado estado = new Estado(0,"1922232", "CC");//Instancia de nueva estado
        String sql = "INSERT into estado VALUES (?, ?, ?, ?);";
        /*Script de inserción SQL, los signos de interrogación corresponden a
        los valores de cada columna
         */
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, estado.getIdentificadorDeServicio());
            ps.setString(2, estado.getEstadoDeServicio());
            ps.setString(3, estado.getDescripcion());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            System.out.println("ok");
        }
    }
}

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
    private Trayecto trayecto;
      
    public DAOTrayecto(){
        trayecto = new Trayecto();
    }
    public void InsertarTrayecto(){
    
        String sql = "INSERT into trayecto VALUES (?, ?, ?, ?, ?, ?);";
        /*Script de inserción SQL, los signos de interrogación corresponden a
        los valores de cada columna
         */
        
         Conexion a = new Conexion();
         
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, trayecto.getIdServicio());
            ps.setInt(2, trayecto.getIdRuta());
            ps.setString(3, trayecto.getDescripcion());
            ps.setString(4, trayecto.getCalle());
            ps.setInt(5, trayecto.getNumero());
            ps.setString(6, trayecto.getBarrio());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            System.out.println("ok");
        }
    }
    public Trayecto getTrayecto() {
        return trayecto;
    }

    public void setTrayecto(Trayecto trayecto) {
        this.trayecto = trayecto;
    }  
}

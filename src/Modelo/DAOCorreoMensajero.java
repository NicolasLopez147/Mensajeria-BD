/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.CorreoMensajero;
import static Modelo.Conexion.con;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Antonio
 */
public class DAOCorreoMensajero {
        private CorreoMensajero correoMensajero;
      
    public DAOCorreoMensajero(){
        correoMensajero = new CorreoMensajero();
    }
    public void InsertarTelefonoCliente(){
    
        String sql = "INSERT into correo_mensajero VALUES (?, ?, ?);";
        /*Script de inserción SQL, los signos de interrogación corresponden a
        los valores de cada columna
         */
        
        Conexion a = new Conexion();
         
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, correoMensajero.getCorreoMenjajero());
            ps.setString(2, correoMensajero.getTipoDocumento());
            ps.setInt(3, correoMensajero.getNumeroDocumento());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            System.out.println("ok");
        }
    }

    public CorreoMensajero getCorreoMensajero() {
        return correoMensajero;
    }

    public void setCorreoMensajero(CorreoMensajero correoMensajero) {
        this.correoMensajero = correoMensajero;
    }
    
    
}

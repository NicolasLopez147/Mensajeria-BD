/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.CorreoCliente;
import static Modelo.Conexion.con;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Antonio
 */
public class DAOCorreoCliente {
    private CorreoCliente correoCliente;
      
    public DAOCorreoCliente(){
        correoCliente = new CorreoCliente();
    }
    public void InsertarTelefonoCliente(){
    
        String sql = "INSERT into correo_cliente VALUES (?, ?, ?);";
        /*Script de inserción SQL, los signos de interrogación corresponden a
        los valores de cada columna
         */
        
        Conexion a = new Conexion();
         
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, correoCliente.getCorreoCliente());
            ps.setString(2, correoCliente.getTipoDocumento());
            ps.setInt(3, correoCliente.getNumeroDocumento());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            System.out.println("ok");
        }
    }    

    public CorreoCliente getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(CorreoCliente correoCliente) {
        this.correoCliente = correoCliente;
    }
    
}

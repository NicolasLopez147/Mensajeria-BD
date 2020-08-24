/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


import Controlador.TelefonoCliente;
import static Modelo.Conexion.con;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Antonio
 */
public class DAOTelefonoCliente {
    private TelefonoCliente telCliente;
      
    public DAOTelefonoCliente(){
        telCliente = new TelefonoCliente();
    }
    public void InsertarTelefonoCliente(){
    
        String sql = "INSERT into telefono_cliente VALUES (?, ?, ?);";
        /*Script de inserción SQL, los signos de interrogación corresponden a
        los valores de cada columna
         */
        
        Conexion a = new Conexion();
         
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, telCliente.getNumeroTelefono());
            ps.setString(2, telCliente.getTipoDocumento());
            ps.setInt(3, telCliente.getNumeroDocumento());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            System.out.println("ok");
        }
    }

    public TelefonoCliente getTelCliente() {
        return telCliente;
    }

    public void setTelCliente(TelefonoCliente telCliente) {
        this.telCliente = telCliente;
    }
    
    
}

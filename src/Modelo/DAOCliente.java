/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.*;
import javax.swing.JOptionPane;
import Controlador.Cliente;
import static Modelo.Conexion.con;

/**
 *
 * @author Juan
 */
public class DAOCliente {
    private Cliente usuario;
    public DAOCliente(){
        usuario = new Cliente();
    }

    public void InsertarCliente() throws SQLException {
        //toca recibir los valores de instancia desde los forms
        String sql = "INSERT into cliente VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        /*Script de inserción SQL, los signos de interrogación corresponden a
        los valores de cada columna
         */
        Conexion a = new Conexion();
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, usuario.getTipoDeDocumento());
            ps.setInt(2, usuario.getNumeroDeDocumento());
            ps.setString(3, usuario.getPrimerNombre());
            ps.setString(4, usuario.getSegundoNombre());
            ps.setString(5, usuario.getPrimerApellido());
            ps.setString(6, usuario.getSegundoApellido());
            ps.setString(7, usuario.getCalle());
            ps.setInt(8, usuario.getNumeroDeCalle());
            ps.setString(9, usuario.getCiudad());
            ps.setString(10, usuario.getBarrio());
            
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            System.out.println("ok");
        }
    
    }

    public Cliente getUsuario() {
        return usuario;
    }

    public void setUsuario(Cliente usuario) {
        this.usuario = usuario;
    }
    
}

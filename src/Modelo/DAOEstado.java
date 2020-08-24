/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.Estado;
import static Modelo.Conexion.con;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan
 */
public class DAOEstado {
    private Estado estado;
    
    public DAOEstado(){
        estado = new Estado();
    }
    public void InsertarEstado() {

        String sql = "INSERT into estado VALUES (?, ?, ?, ?);";
        /*Script de inserción SQL, los signos de interrogación corresponden a
        los valores de cada columna
         */
        Conexion a = new Conexion();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, estado.getIdServicio());
            ps.setString(2, estado.getEstadoServicio());
            ps.setString(3, estado.getFechaCambio());
            ps.setString(4, estado.getDescripcion());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            System.out.println("ok");
        }
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
}

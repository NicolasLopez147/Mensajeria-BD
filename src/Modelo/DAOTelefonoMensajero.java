/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.TelefonoMensajero;
import static Modelo.Conexion.con;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Antonio
 */
public class DAOTelefonoMensajero {
    private TelefonoMensajero telMensajero;
      
    public DAOTelefonoMensajero(){
        telMensajero = new TelefonoMensajero();
    }
    public void InsertarTelefonoMensajero(){
    
        String sql = "INSERT into telefono_mensajero VALUES (?, ?, ?);";
        /*Script de inserción SQL, los signos de interrogación corresponden a
        los valores de cada columna
         */
        
        Conexion a = new Conexion();
         
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, telMensajero.getTelefonoMensajero());
            ps.setString(2, telMensajero.getTipoDocumento());
            ps.setInt(3, telMensajero.getNumeroDocumento());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            System.out.println("ok");
        }
    }

    public TelefonoMensajero getTelMensajero() {
        return telMensajero;
    }

    public void setTelMensajero(TelefonoMensajero telMensajero) {
        this.telMensajero = telMensajero;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import static Modelo.Conexion.con;
import java.sql.*;
import javax.swing.JOptionPane;
import Controlador.Servicio;

/**
 *
 * @author Juan
 */
public class DAOServicio {
    private Servicio servicio;
    public DAOServicio(){
        servicio = new Servicio();
    }
    
    public void InsertarServicio(){
        Servicio servicio = new Servicio();
        String sql = "INSERT into servicio VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
        //Script de inserción SQL, los signos de interrogación corresponden a
        //los valores de cada columna
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, servicio.getIdServicio());
            ps.setInt(2, servicio.getCantidadDeTrayectos());
            ps.setString(3, servicio.getTipoDeTransporte());
            ps.setString(4, servicio.getFechaDeInicio());
            ps.setString(5, servicio.getHoraDeInicio());
            ps.setInt(6, servicio.getComision());
            ps.setInt(7, servicio.getCostoTotal());
            ps.setInt(8, servicio.getCalificacion());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            System.out.println("ok");
        }
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.*;
import static Modelo.Conexion.con;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan
 */
public class DAOMensajero {

    public void InsertarMensajero() throws SQLException {
        Mensajero mensajero = new Mensajero("C.C", 0, 2.5, "M", "Veneco", "25082000", "No", "Paquete", 25584.25, "Moto", "No");//Instancia de nuevo mensajero
        //toca recibir los valores de instancia desde los forms
        String sql = "INSERT into mensajero VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        /*Script de inserción SQL, los signos de interrogación corresponden a
        los valores de cada columna
         */
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, mensajero.getTipoDeDocumento());
            ps.setInt(2, mensajero.getNumeroDeDocumento());
            ps.setDouble(3, mensajero.getCalificacionPromedio());
            ps.setString(4, mensajero.getSexo());
            ps.setString(5, mensajero.getNacionalidad());
            ps.setString(6, mensajero.getFechaDeNacimiento());//Toca convertir el String a date
            ps.setString(7, mensajero.getSeguridadSocial());
            ps.setString(8, mensajero.getMedioDeTransporte());
            ps.setDouble(9, mensajero.getPagoAcumulado());
            ps.setString(10, mensajero.getTipoDeTransporte());
            ps.setString(11, mensajero.getEstado());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            System.out.println("ok");
        }
    }
}

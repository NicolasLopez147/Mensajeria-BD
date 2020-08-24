/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.Mensajero;
import static Modelo.Conexion.con;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan
 */
public class DAOMensajero {
    private Mensajero mensajero;
    
    public DAOMensajero(){
        mensajero = new Mensajero();
    }

    public void InsertarMensajero() throws SQLException {
//        Mensajero mensajero = new Mensajero("C.C", 0, 2.5, "M", "Veneco", "25082000", "No", "Paquete", 25584.25, "Moto", "No");//Instancia de nuevo mensajero
        //toca recibir los valores de instancia desde los forms
        String sql = "INSERT into mensajero VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?,?,?,?);";
        /*Script de inserción SQL, los signos de interrogación corresponden a
        los valores de cada columna
        
         */
     //   Mensajero mensajero = new Mensajero();
        
        Conexion a = new Conexion();
        String sfecha []= mensajero.getFechaDeNacimiento().split("/");
        int ifecha []= new int [sfecha.length];
        for (int i = 0 ; i < ifecha.length; i ++){
            ifecha[i] = Integer.valueOf(sfecha[i]);
        }
        Date fecha = new Date(ifecha[0], ifecha[1],ifecha[2]);
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, mensajero.getTipoDeDocumento());
            ps.setInt(2, mensajero.getNumeroDeDocumento());
            ps.setString(3, mensajero.getPrimNombre());
            ps.setString(4, mensajero.getSegNombre());
            ps.setString(5, mensajero.getPrimApellido());
            ps.setString(6, mensajero.getSegApellido());
            ps.setDouble(7, mensajero.getCalificacionPromedio());
            ps.setString(8, mensajero.getSexo());
            ps.setString(9, mensajero.getNacionalidad());
            ps.setDate(10, fecha);//Toca convertir el String a date
            ps.setString(11, mensajero.getSeguridadSocial());
            ps.setString(12, mensajero.getMedioDeTransporte());
            ps.setDouble(13, mensajero.getPagoAcumulado());
            ps.setString(14, mensajero.getTipoDeTransporte());
            ps.setString(15, mensajero.getEstado());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            System.out.println("ok");
        }
    }
        public Mensajero getMensajero() {
        return mensajero;
    }

    public void setMensajero(Mensajero mensajero) {
        this.mensajero = mensajero;
    }
}

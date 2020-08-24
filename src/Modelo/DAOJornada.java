/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.Jornada;
import static Modelo.Conexion.con;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan
 */
public class DAOJornada {
    public void InsertarJornada(){
    Jornada jornada = new Jornada(0, "CC", 1922232, "2000","2100");//Instancia de nueva jornada
        String sql = "INSERT into jornada VALUES (?, ?, ?, ?);";
        /*Script de inserción SQL, los signos de interrogación corresponden a
        los valores de cada columna
         */
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, jornada.getDia());
            ps.setString(2, jornada.getTipoDeDocumento());
            ps.setInt(3, jornada.getNumeroDeDocumento());
            ps.setString(4, jornada.getHoraInicial());
            ps.setString(5, jornada.getHoraFinal());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            System.out.println("ok");
        }
}
}

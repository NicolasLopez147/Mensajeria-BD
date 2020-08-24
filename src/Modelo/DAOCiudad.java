/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.sql.*;
import Controlador.Ciudad;
import static Modelo.Conexion.con;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan
 */
public class DAOCiudad {
    private Ciudad ciudad;
    public DAOCiudad(){
        ciudad = new Ciudad();
    }
    public void InsertarCiudad(){
        String sql = "INSERT into ciudad VALUES (?, ?, ?);";
        Conexion a = new Conexion();
        
     try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ciudad.getCodigoPostal());
            ps.setString(2, ciudad.getNombre());
            ps.setDouble(3, ciudad.getCostoTrayecto());            
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            System.out.println("ok");
        }
    
    }
    public Ciudad buscarCiudad(String consulta){
        String sql = "SELECT * FROM camunicipio WHERE k_codigo_postal = ?";
        Conexion a = new Conexion();
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            int codigoPostal = Integer.valueOf(consulta);
            ps.setInt(1, codigoPostal);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ciudad.setCodigoPostal(rs.getInt("k_codigo_postal"));
                ciudad.setNombre(rs.getString("n_nombre"));
                ciudad.setCostoTrayecto(rs.getInt("v_costo_por_trayecto"));
                }          
            ps.executeUpdate();
            ps.close();
            

      }catch(Exception e){ 
      }
        return ciudad;
        
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
    
}

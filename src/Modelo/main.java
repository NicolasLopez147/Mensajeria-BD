/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.SQLException;

/**
 *
 * @author Juan
 */
public class main {
    public static void main(String[] args) throws SQLException{
       Conexion a = new Conexion();//Toca instanciar la conexion o efe :v
        
       DAOCliente b = new DAOCliente();//Esto es prueba xd
       b.InsertarCliente();//Esto es de prueba :v
       
    }
}

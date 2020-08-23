/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DAOCliente;
import java.sql.SQLException;

/**
 *
 * @author Antonio
 */
public class Controlador {
    private DAOCliente cliente;
    
    public Controlador(){
        cliente = new DAOCliente();
    }
    public void InsertarCliente() throws SQLException{
      cliente.InsertarCliente();
    }
    public Cliente getCliente() {
        return cliente.getUsuario();
    }    
}

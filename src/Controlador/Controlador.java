/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DAOCiudad;
import Modelo.DAOCliente;
import Modelo.DAOCorreoCliente;
import Modelo.DAOCorreoMensajero;
import Modelo.DAOEstado;
import Modelo.DAOJornada;
import Modelo.DAOMensajero;
import Modelo.DAOServicio;
import Modelo.DAOTelefonoCliente;
import Modelo.DAOTelefonoMensajero;
import Modelo.DAOTrayecto;
import java.sql.SQLException;

/**
 *
 * @author Antonio
 */
public class Controlador {
    
    private DAOCiudad ciudad;
    private DAOCliente cliente;
    private DAOEstado estado;
    private DAOJornada jornada;
    private DAOMensajero mensajero;
    private DAOServicio servicio;
    private DAOTrayecto trayecto; 
    private DAOTelefonoCliente telefonoCliente;
    private DAOTelefonoMensajero telefonoMensajero;
    private DAOCorreoCliente correoCliente;
    private DAOCorreoMensajero correoMensajero;
    
    public Controlador(){
        ciudad = new DAOCiudad();
        cliente = new DAOCliente();
        estado = new DAOEstado();
        jornada = new DAOJornada();
        mensajero = new DAOMensajero();
        servicio = new DAOServicio();
        trayecto = new DAOTrayecto(); 
        telefonoCliente = new DAOTelefonoCliente();
        telefonoMensajero = new DAOTelefonoMensajero();
        correoCliente = new DAOCorreoCliente();
        correoMensajero = new DAOCorreoMensajero();
    }
    public void InsertarCliente() throws SQLException{
      cliente.InsertarCliente();
    }
    
    public void InsertarMensajero() throws SQLException{
        mensajero.InsertarMensajero();
    }
    
    public void InsertarCiudad() throws SQLException{
      ciudad.InsertarCiudad();
    }
    public Ciudad BuscarCiudad(String consulta) throws SQLException{
      return ciudad.buscarCiudad(consulta);
    }
    
    public void InsertarEstado() throws SQLException{
      estado.InsertarEstado();
    }
    
    public void InsertarJornada() throws SQLException{
      jornada.InsertarJornada();
    }
    
    public void InsertarServicio() throws SQLException{
      servicio.InsertarServicio();
    }
    
    public void InsertarTrayecto() throws SQLException{
        trayecto.InsertarTrayecto();
    }
    
    public void InsertarTelefonoCliente() throws SQLException{
        telefonoCliente.InsertarTelefonoCliente();
    }
    
    public void InsertarTelefonoMensajero() throws SQLException{
        telefonoMensajero.InsertarTelefonoMensajero();
    }
    
    public void InsertarCorreoCliente() throws SQLException{
        correoCliente.InsertarTelefonoCliente();
    }
    
    public void InsertarCorreoMensajero() throws SQLException{
        correoMensajero.InsertarTelefonoCliente();
    }
    
    public Cliente getCliente() {
        return cliente.getUsuario();
    }
    public Mensajero getMensajero() {
        return mensajero.getMensajero();
    }
    public Ciudad getCiudad() {
        return ciudad.getCiudad();
    }
    public Estado getEstado() {
        return estado.getEstado();
    }
    public Jornada getJornada() {
        return jornada.getJornada();
    }
    public Servicio getServicio() {
        return servicio.getServicio();
    }
    public Trayecto getTrayecto() {
        return trayecto.getTrayecto();
    }

    public TelefonoCliente getTelefonoCliente() {
        return telefonoCliente.getTelCliente();
    }

    public TelefonoMensajero getTelefonoMensajero() {
        return telefonoMensajero.getTelMensajero();
    }

    public CorreoCliente getCorreoCliente() {
        return correoCliente.getCorreoCliente();
    }


    public CorreoMensajero getCorreoMensajero() {
        return correoMensajero.getCorreoMensajero();
    }

}

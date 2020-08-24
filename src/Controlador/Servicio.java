/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Juan
 */
public class Servicio {
    int idServicio;
    int cantidadDeTrayectos;
    String tipoDeTransporte;
    String tipoIdaVuelta;
    String fechaDeInicio;
    String horaDeInicio;
    int comision;
    int costoTotal;
    int calificacion;
    int codigoPostal;
    String tipoDocumentoMensajero;
    int numeroDocumentoMensajero;
    String tipoDocumentoCliente;
    int numeroDocumentoCliente;
    
    public Servicio(){
    }

    public String getTipoIdaVuelta() {
        return tipoIdaVuelta;
    }

    public void setTipoIdaVuelta(String tipoIdaVuelta) {
        this.tipoIdaVuelta = tipoIdaVuelta;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getTipoDocumentoMensajero() {
        return tipoDocumentoMensajero;
    }

    public void setTipoDocumentoMensajero(String tipoDocumentoMensajero) {
        this.tipoDocumentoMensajero = tipoDocumentoMensajero;
    }

    public int getNumeroDocumentoMensajero() {
        return numeroDocumentoMensajero;
    }

    public void setNumeroDocumentoMensajero(int numeroDocumentoMensajero) {
        this.numeroDocumentoMensajero = numeroDocumentoMensajero;
    }

    public String getTipoDocumentoCliente() {
        return tipoDocumentoCliente;
    }

    public void setTipoDocumentoCliente(String tipoDocumentoCliente) {
        this.tipoDocumentoCliente = tipoDocumentoCliente;
    }

    public int getNumeroDocumentoCliente() {
        return numeroDocumentoCliente;
    }

    public void setNumeroDocumentoCliente(int numeroDocumentoCliente) {
        this.numeroDocumentoCliente = numeroDocumentoCliente;
    }
    
    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public int getCantidadDeTrayectos() {
        return cantidadDeTrayectos;
    }

    public void setCantidadDeTrayectos(int cantidadDeTrayectos) {
        this.cantidadDeTrayectos = cantidadDeTrayectos;
    }

    public String getTipoDeTransporte() {
        return tipoDeTransporte;
    }

    public void setTipoDeTransporte(String tipoDeTransporte) {
        this.tipoDeTransporte = tipoDeTransporte;
    }

    public String getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(String fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public String getHoraDeInicio() {
        return horaDeInicio;
    }

    public void setHoraDeInicio(String horaDeInicio) {
        this.horaDeInicio = horaDeInicio;
    }

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }

    public int getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(int costoTotal) {
        this.costoTotal = costoTotal;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    
}

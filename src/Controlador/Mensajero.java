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
public class Mensajero {
    //Las variables deberían ser privadas?, pues tienen setters y getters
    //No estoy seguro de algunos tipos, por ejemplo los double, es mejor poner long?
    //Algunos Strings pueden ser char como sexo, pero el preparement statment no lo reconoce u.u, entoncesw lo dejé String xd
    String tipoDeDocumento;
    int numeroDeDocumento;
    double calificacionPromedio;
    String sexo;
    String nacionalidad;
    String fechaDeNacimiento;
    String seguridadSocial;
    String medioDeTransporte;
    double pagoAcumulado;
    String tipoDeTransporte;
    String estado;

    //Constructor de mensajero
    public Mensajero(String tipoDeDocumento, int numeroDeDocumento, double calificacionPromedio, String sexo, String nacionalidad, String fechaDeNacimiento, String seguridadSocial, String medioDeTransporte, double pagoAcumulado, String tipoDeTransporte, String estado) {
        this.tipoDeDocumento = tipoDeDocumento;
        this.numeroDeDocumento = numeroDeDocumento;
        this.calificacionPromedio = calificacionPromedio;
        this.sexo = sexo;
        this.nacionalidad = nacionalidad;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.seguridadSocial = seguridadSocial;
        this.medioDeTransporte = medioDeTransporte;
        this.pagoAcumulado = pagoAcumulado;
        this.tipoDeTransporte = tipoDeTransporte;
        this.estado = estado;
    }

    public String getTipoDeDocumento() {
        return tipoDeDocumento;
    }

    public void setTipoDeDocumento(String tipoDeDocumento) {
        this.tipoDeDocumento = tipoDeDocumento;
    }

    public int getNumeroDeDocumento() {
        return numeroDeDocumento;
    }

    public void setNumeroDeDocumento(int numeroDeDocumento) {
        this.numeroDeDocumento = numeroDeDocumento;
    }

    public double getCalificacionPromedio() {
        return calificacionPromedio;
    }

    public void setCalificacionPromedio(double calificacionPromedio) {
        this.calificacionPromedio = calificacionPromedio;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getSeguridadSocial() {
        return seguridadSocial;
    }

    public void setSeguridadSocial(String seguridadSocial) {
        this.seguridadSocial = seguridadSocial;
    }

    public String getMedioDeTransporte() {
        return medioDeTransporte;
    }

    public void setMedioDeTransporte(String medioDeTransporte) {
        this.medioDeTransporte = medioDeTransporte;
    }

    public double getPagoAcumulado() {
        return pagoAcumulado;
    }

    public void setPagoAcumulado(double pagoAcumulado) {
        this.pagoAcumulado = pagoAcumulado;
    }

    public String getTipoDeTransporte() {
        return tipoDeTransporte;
    }

    public void setTipoDeTransporte(String tipoDeTransporte) {
        this.tipoDeTransporte = tipoDeTransporte;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}

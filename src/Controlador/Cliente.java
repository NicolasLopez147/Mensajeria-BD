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
public class Cliente {
    //Las variables deberían ser privadas?, pues tienen setters y getters
    String tipoDeDocumento;
    int numeroDeDocumento;
    String primerNombre;
    String segundoNombre;
    String primerApellido;
    String segundoApellido;
    String calle;
    int numeroDeCalle;
    String ciudad;
    String barrio;

    /*Constructor del cliente*/
    public Cliente(String tipoDeDocumento, int numeroDeDocumento, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String calle, int numeroDeCalle, String ciudad, String barrio) {
        this.tipoDeDocumento = tipoDeDocumento;
        this.numeroDeDocumento = numeroDeDocumento;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.calle = calle;
        this.numeroDeCalle = numeroDeCalle;
        this.ciudad = ciudad;
        this.barrio = barrio;
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
  

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumeroDeCalle() {
        return numeroDeCalle;
    }

    public void setNumeroDeCalle(int numeroDeCalle) {
        this.numeroDeCalle = numeroDeCalle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }
    
    
}

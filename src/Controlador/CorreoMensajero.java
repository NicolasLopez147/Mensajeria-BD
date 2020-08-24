/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Antonio
 */
public class CorreoMensajero {
    String correoMenjajero;
    String tipoDocumento;
    int numeroDocumento;
    
    public CorreoMensajero(){
    }

    public String getCorreoMenjajero() {
        return correoMenjajero;
    }

    public void setCorreoMenjajero(String correoMenjajero) {
        this.correoMenjajero = correoMenjajero;
    }


    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }
    
}

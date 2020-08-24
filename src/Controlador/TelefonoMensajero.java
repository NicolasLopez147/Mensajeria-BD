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
public class TelefonoMensajero {
    private int telefonoMensajero;
    private String tipoDocumento;
    private int numeroDocumento;
    
    public TelefonoMensajero(){
    }

    public int getTelefonoMensajero() {
        return telefonoMensajero;
    }

    public void setTelefonoMensajero(int telefonoMensajero) {
        this.telefonoMensajero = telefonoMensajero;
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

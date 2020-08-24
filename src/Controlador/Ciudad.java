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
public class Ciudad {
    private int codigoPostal;
    private String nombre;
    private int costoTrayecto;
    
    public Ciudad(){
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCostoTrayecto() {
        return costoTrayecto;
    }

    public void setCostoTrayecto(int costoTrayecto) {
        this.costoTrayecto = costoTrayecto;
    }
    
}

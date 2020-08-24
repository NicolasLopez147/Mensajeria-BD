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
public class Ciudad {
    int codigoPostal;
    String nombre;
    double CostoPorTrayecto;

    public Ciudad(int codigoPostal, String nombre, double CostoPorTrayecto) {
        this.codigoPostal = codigoPostal;
        this.nombre = nombre;
        this.CostoPorTrayecto = CostoPorTrayecto;
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

    public double getCostoPorTrayecto() {
        return CostoPorTrayecto;
    }

    public void setCostoPorTrayecto(double CostoPorTrayecto) {
        this.CostoPorTrayecto = CostoPorTrayecto;
    }
    
}

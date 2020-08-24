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
public class Trayecto {
    private int identificadorDeServicio;
    private int identificadorDeRuta;
    private String descripcion;
    private String calle;
    private int numeroDeCalle;
    String barrio;

    public Trayecto(int identificadorDeServicio, int identificadorDeRuta, String descripcion, String calle, int numeroDeCalle, String barrio) {
        this.identificadorDeServicio = identificadorDeServicio;
        this.identificadorDeRuta = identificadorDeRuta;
        this.descripcion = descripcion;
        this.calle = calle;
        this.numeroDeCalle = numeroDeCalle;
        this.barrio = barrio;
    }

    public int getIdentificadorDeServicio() {
        return identificadorDeServicio;
    }

    public int getIdentificadorDeRuta() {
        return identificadorDeRuta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCalle() {
        return calle;
    }


    public int getNumeroDeCalle() {
        return numeroDeCalle;
    }


    public String getBarrio() {
        return barrio;
    }   
}

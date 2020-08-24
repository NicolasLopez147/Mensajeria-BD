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
public class Estado {
    int identificadorDeServicio;
    String estadoDeServicio;
    String descripcion;

    public Estado(int identificadorDeServicio, String estadoDeServicio, String descripcion) {
        this.identificadorDeServicio = identificadorDeServicio;
        this.estadoDeServicio = estadoDeServicio;
        this.descripcion = descripcion;
    }

    public int getIdentificadorDeServicio() {
        return identificadorDeServicio;
    }

    public void setIdentificadorDeServicio(int identificadorDeServicio) {
        this.identificadorDeServicio = identificadorDeServicio;
    }

    public String getEstadoDeServicio() {
        return estadoDeServicio;
    }

    public void setEstadoDeServicio(String estadoDeServicio) {
        this.estadoDeServicio = estadoDeServicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}

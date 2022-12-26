/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Juanma
 */
public class Servicio {
    private String nombreServicio;
    private String descripcion;
    private double precio;

    public Servicio(String nombreServicio, String descripcion, double precio) {
        this.nombreServicio = nombreServicio;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }
    
    
}

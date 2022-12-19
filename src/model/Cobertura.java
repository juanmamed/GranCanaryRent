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
public class Cobertura {
    private float precio;
    private String nombreSeguro;

    public Cobertura(float precio, String nombreSeguro) {
        this.precio = precio;
        this.nombreSeguro = nombreSeguro;
    }

    public float getPrecio() {
        return precio;
    }

    public String getNombreSeguro() {
        return nombreSeguro;
    }
    
    
}

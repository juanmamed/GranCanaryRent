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
public class Seguro {
    private String precio;
    private String nombreCobertura;

    public Seguro(String precio, String nombreCobertura) {
        this.precio = precio;
        this.nombreCobertura = nombreCobertura;
    }

    public String getPrecio() {
        return precio;
    }

    public String getNombreCobertura() {
        return nombreCobertura;
    }
    
    
}

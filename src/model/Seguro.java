/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Juanma
 */
public class Seguro {
    private String nombreSeguro;
    private double precio;
    private ArrayList<Cobertura> coberturas = new ArrayList<Cobertura>();
    
    public Seguro(String nombreSeguro, double precio) {
        this.nombreSeguro = nombreSeguro;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombreSeguro() {
        return nombreSeguro;
    }

    public ArrayList<Cobertura> getCoberturas() {
        return coberturas;
    }
    
    public void addCobertura(String nombre, String descripcion){
        coberturas.add(new Cobertura(nombre, descripcion));
    }
}

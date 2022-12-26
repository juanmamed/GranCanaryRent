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
    private String nombreCobertura;
    private String descripcion;

    public Cobertura(String nombreCobertura, String descripcion) {
        this.nombreCobertura = nombreCobertura;
        this.descripcion = descripcion;
    }
    public String getNombreCobertura() {
        return nombreCobertura;
    }

    public String getDescripcion() {
        return descripcion;
    }
}

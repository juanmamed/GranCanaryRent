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
public class Telefono {
    private String prefijo;
    private String numero;

    public Telefono(String prefijo, String numero) {
        this.prefijo = prefijo;
        this.numero = numero;
    }

    public String getPrefijo() {
        return prefijo;
    }

    public String getNumero() {
        return numero;
    }
    
}

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
public class TarjetaCredito {
    private String nombrePropietario;
    private int cvc;
    private int numero;
    private String fechaValidez;

    public TarjetaCredito(String nombrePropietario, int cvc, int numero, String fechaValidez) {
        this.nombrePropietario = nombrePropietario;
        this.cvc = cvc;
        this.numero = numero;
        this.fechaValidez = fechaValidez;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public int getCvc() {
        return cvc;
    }

    public int getNumero() {
        return numero;
    }

    public String getFechaValidez() {
        return fechaValidez;
    }
    
    
}

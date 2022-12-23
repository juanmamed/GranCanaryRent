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
    private String numero;
    private String fechaValidez;

    public TarjetaCredito(String nombrePropietario, int cvc, String numero, String fechaValidez) {
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

    public String getNumero() {
        return numero;
    }

    public String getFechaValidez() {
        return fechaValidez;
    }
    
    public String toString(){
        String result = "";
        result += "XXXX XXXX XXXX " + this.numero.substring(12, this.numero.length());
        return result;
    }
    
}

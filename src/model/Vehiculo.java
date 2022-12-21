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
public class Vehiculo {
    private TipoCambio tipoCambio;
    private TipoMotor tipoMotor;
    private TipoVehiculo tipoVehiculo;
    private int numAsientos;
    private int numPuertas;
    private float precio;
    private String modelo;

    public Vehiculo(TipoCambio tipoCambio, TipoMotor tipoMotor, TipoVehiculo tipoVehiculo, int numAsientos, int numPuertas, float precio, String modelo) {
        this.tipoCambio = tipoCambio;
        this.tipoMotor = tipoMotor;
        this.tipoVehiculo = tipoVehiculo;
        this.numAsientos = numAsientos;
        this.numPuertas = numPuertas;
        this.precio = precio;
        this.modelo = modelo;
    }

    public TipoCambio getTipoCambio() {
        return tipoCambio;
    }

    public TipoMotor getTipoMotor() {
        return tipoMotor;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public float getPrecio() {
        return precio;
    }

    public String getModelo() {
        return modelo;
    }
}

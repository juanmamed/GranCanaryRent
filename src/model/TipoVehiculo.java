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
public enum TipoVehiculo {
    PEQUEÑO("Pequeño"), MEDIANO("Mediano"), GRANDE("Grande"), MOTO("Moto"), MONOVOLUMEN("MonoVolumen"), FAMILIAR("Familiar");
    
    private String tipoVehiculo;
    
    private TipoVehiculo(String tipoVehiculo){
        this.tipoVehiculo=tipoVehiculo;
    }
    
    public String getTipoCambio(){
        return this.tipoVehiculo;
    }
}

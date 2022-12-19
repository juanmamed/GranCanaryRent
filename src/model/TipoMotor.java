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
public enum TipoMotor {
        DIESEL("Diesel"), GASOLINA("Gasolina"), HIBRIDO("Hibrido"), ELECTRICO("Electrico");
    
    private String tipoMotor;
    
    private TipoMotor(String tipoMotor){
        this.tipoMotor=tipoMotor;
    }
    
    public String getTipoCambio(){
        return this.tipoMotor;
    }
}

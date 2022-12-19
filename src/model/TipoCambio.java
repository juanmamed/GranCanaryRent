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
public enum TipoCambio {
    MANUAL("Manual"), AUTOMATICO("Automatico");
    
    private String tipoCambio;
    
    private TipoCambio(String tipoCambio){
        this.tipoCambio=tipoCambio;
    }
    
    public String getTipoCambio(){
        return this.tipoCambio;
    }
}

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
public class Oficina {
    private String direccion;
    private String numContacto;
    private ArrayList<Vehiculo> vehiculosDisponibles;

    public Oficina(String direccion, String numContacto, ArrayList<Vehiculo> vehiculosDisponibles) {
        this.direccion = direccion;
        this.numContacto = numContacto;
        this.vehiculosDisponibles = vehiculosDisponibles;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNumContacto() {
        return numContacto;
    }

    public ArrayList<Vehiculo> getVehiculosDisponibles() {
        return vehiculosDisponibles;
    }
    
    public void loadVehiculos(String jsonVehiculos){
        
    }
}
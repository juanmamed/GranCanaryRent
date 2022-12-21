/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Juanma
 */
public class Oficina {
    private String direccion;
    private String numContacto;
    private ArrayList<Vehiculo> vehiculosDisponibles = new ArrayList<Vehiculo>();

    public Oficina(String direccion, String numContacto) {
        this.direccion = direccion;
        this.numContacto = numContacto;
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
    
    
    @Override
    public String toString(){
        String result = "";
        result += this.getDireccion() + " - " + this.getNumContacto();
        return result;
    }

    public void loadVehiculos(JSONArray array) {
        Iterator<JSONObject> iterator = array.iterator();
        JSONObject json_vehiculo;

        while(iterator.hasNext()){
            
            json_vehiculo = (JSONObject) iterator.next();
            Vehiculo vehiculo = new Vehiculo();
            vehiculosDisponibles.add(vehiculo);
        }
        vehiculosDisponibles.add(new Vehiculo(jsonArray));
    }
}

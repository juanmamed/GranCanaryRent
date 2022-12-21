/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
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
public class GranCanaryRent {
    private ArrayList<Oficina> Oficinas = new ArrayList<Oficina>();

    public GranCanaryRent() {
    }

    public ArrayList<Oficina> getOficinas() {
        return Oficinas;
    }
    
    public void loadOficinas(String file) throws FileNotFoundException, IOException, ParseException{
        JSONParser parser = new JSONParser();

        Object o = parser.parse(new FileReader(file));
        
        JSONArray array = (JSONArray) o;
        Iterator<JSONObject> iterator = array.iterator();
        JSONObject json_oficina;

        while(iterator.hasNext()){
            
            json_oficina = (JSONObject) iterator.next();
            Oficina oficina = new Oficina((String) json_oficina.get("direccion"), (String) json_oficina.get("numero"));
            oficina.loadVehiculos((JSONArray) json_oficina.get("vehiculos"));
            Oficinas.add(oficina);
        }
    }
}

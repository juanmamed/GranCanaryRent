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
        JSONObject oficina;
        int contador=0;
        while(iterator.hasNext()){
            
            oficina = (JSONObject) iterator.next();
            Oficinas.add(new Oficina((String) oficina.get("direccion"), (String) oficina.get("numero")));
        }
    }
}

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
import java.time.LocalDate;
import java.time.format.*;
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
    private ArrayList<Oficina> oficinas = new ArrayList<Oficina>();
    private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

    public GranCanaryRent() {
    }

    public ArrayList<Oficina> getOficinas() {
        return oficinas;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
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
            if(existOficina(oficina.getDireccion()) == false){
                oficinas.add(oficina);
            }
        }
    }
    
    public void loadUsuarios(String file) throws FileNotFoundException, IOException, ParseException{
        JSONParser parser = new JSONParser();

        Object o = parser.parse(new FileReader(file));
        
        JSONArray array = (JSONArray) o;
        Iterator<JSONObject> iterator = array.iterator();
        JSONObject json_usuarios;
        DateTimeFormatter formatter;
        formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        while(iterator.hasNext()){
            json_usuarios = (JSONObject) iterator.next();
            LocalDate fechaNacimiento = LocalDate.parse((String) json_usuarios.get("fechaNacimiento"), formatter);
            
            Usuario usuario = new Usuario((String) json_usuarios.get("email"), (String) json_usuarios.get("contraseña"), (String) json_usuarios.get("nombre"), fechaNacimiento, new Telefono((String) json_usuarios.get("prefijo"), (String) json_usuarios.get("numero")));
            
            if(existUsuario(usuario.getNombre()) == false){
                JSONArray array_tarjetas = (JSONArray) json_usuarios.get("TarjetaCredito");
                Iterator<JSONObject> iterator_tarjetas = array_tarjetas.iterator();
                JSONObject json_tarjetas;
                while(iterator_tarjetas.hasNext()){
                    json_tarjetas = (JSONObject) iterator_tarjetas.next();
                    usuario.addCreditCard((String) json_tarjetas.get("nombrePropietario"), Math.toIntExact((long) json_tarjetas.get("cvc")), (String) json_tarjetas.get("numero"), (String) json_tarjetas.get("fechaValidez"));
                }
                usuarios.add(usuario);
            }
        }
    }
    
    public boolean existOficina(String direccion){
        for(int i=0; i<oficinas.size();i++){
            if(this.oficinas.get(i).getDireccion().compareTo(direccion)==0){
                return true;
            }
        }
        return false;
    }
    
    public boolean existUsuario(String nombre){
        for(int i=0; i<usuarios.size();i++){
            if(this.usuarios.get(i).getNombre().compareTo(nombre)==0){
                return true;
            }
        }
        return false;
    }
    
    
}

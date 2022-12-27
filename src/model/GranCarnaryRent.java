/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
/**
 *
 * @author Juanma
 */
public class GranCarnaryRent {
    private ArrayList<Oficina> oficinas = new ArrayList<Oficina>();
    private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    private ArrayList<Servicio> servicios = new ArrayList<Servicio>();
    private ArrayList<Seguro> seguros = new ArrayList<Seguro>();
    private int numReservas = 0;

    public GranCarnaryRent() {
    }

    public ArrayList<Oficina> getOficinas() {
        return oficinas;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    
    public ArrayList<Servicio> getServicios() {
        return servicios;
    }

    public ArrayList<Seguro> getSeguros() {
        return seguros;
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
    
    public void loadUsuarios(String file) throws FileNotFoundException, IOException, ParseException, java.text.ParseException{
        JSONParser parser = new JSONParser();

        Object o = parser.parse(new FileReader(file));
        
        JSONArray array = (JSONArray) o;
        Iterator<JSONObject> iterator = array.iterator();
        JSONObject json_usuarios;

        while(iterator.hasNext()){
            json_usuarios = (JSONObject) iterator.next();
            
            Usuario usuario = new Usuario((String) json_usuarios.get("email"), (String) json_usuarios.get("contraseña"), (String) json_usuarios.get("nombre"), (String) json_usuarios.get("numero"));
            
            if(existUsuario(usuario.getNombre(), usuario.getEmail()) == false){
                JSONArray array_tarjetas = (JSONArray) json_usuarios.get("TarjetaCredito");
                Iterator<JSONObject> iterator_tarjetas = array_tarjetas.iterator();
                JSONObject json_tarjetas;
                while(iterator_tarjetas.hasNext()){
                    json_tarjetas = (JSONObject) iterator_tarjetas.next();
                    usuario.addCreditCard((String) json_tarjetas.get("nombrePropietario"), Math.toIntExact((long) json_tarjetas.get("cvc")), (String) json_tarjetas.get("numero"), (String) json_tarjetas.get("fechaValidez"));
                }
                JSONArray array_reservas = (JSONArray) json_usuarios.get("Reservas");
                Iterator<JSONObject> iterator_reservas = array_reservas.iterator();
                JSONObject json_reservas;
                while(iterator_reservas.hasNext()){
                    json_reservas = (JSONObject) iterator_reservas.next();
                    Oficina oficina_recogida = this.getOficina((String) json_reservas.get("oficinaRecogida"));
                    Oficina oficina_entrega = this.getOficina((String) json_reservas.get("oficinaEntrega"));
                    Date fecha_recogida = this.getDate((String) json_reservas.get("fechaRecogida"));
                    Date fecha_entrega = this.getDate((String) json_reservas.get("fechaEntrega"));
                    System.out.println((String) json_reservas.get("vehiculo"));
                    System.out.println("----------------------------------");
                    Vehiculo vehiculo = this.getVehiculo((String) json_reservas.get("oficinaRecogida"), (String) json_reservas.get("vehiculo"));
                    
                    Seguro seguro = this.getSeguro((String) json_reservas.get("Seguro"));
                    numReservas++;
                    Reserva reserva = new Reserva(oficina_recogida, oficina_entrega, fecha_recogida, fecha_entrega, vehiculo, seguro, (double) json_reservas.get("precio"),(boolean) json_reservas.get("pagado"), numReservas);
                    usuario.addReserva(reserva);
                }
                usuarios.add(usuario);
            }
        }
    }
    
    public void loadServicios(String file) throws FileNotFoundException, IOException, ParseException{
        JSONParser parser = new JSONParser();

        Object o = parser.parse(new FileReader(file));
        
        JSONArray array = (JSONArray) o;
        Iterator<JSONObject> iterator = array.iterator();
        JSONObject json_servicio;

        while(iterator.hasNext()){
            
            json_servicio = (JSONObject) iterator.next();
            Servicio servicio = new Servicio((String) json_servicio.get("nombre"), (String) json_servicio.get("descripcion"), (double) json_servicio.get("precio"));
            if(existServicio(servicio.getNombreServicio()) == false){
                servicios.add(servicio);
            }
        }
    }
    
    public void loadSeguros(String file) throws FileNotFoundException, IOException, ParseException{
        JSONParser parser = new JSONParser();

        Object o = parser.parse(new FileReader(file));
        
        JSONArray array = (JSONArray) o;
        Iterator<JSONObject> iterator = array.iterator();
        JSONObject json_seguro;

        while(iterator.hasNext()){
            
            json_seguro = (JSONObject) iterator.next();
            Seguro seguro = new Seguro((String) json_seguro.get("nombre"), (double) json_seguro.get("precio"));
            if(existSeguro(seguro.getNombreSeguro()) == false){
                JSONArray array_coberturas = (JSONArray) json_seguro.get("coberturas");
                Iterator<JSONObject> iterator_coberturas = array_coberturas.iterator();
                JSONObject json_coberturas;
                while(iterator_coberturas.hasNext()){
                    json_coberturas = (JSONObject) iterator_coberturas.next();
                    seguro.addCobertura((String) json_coberturas.get("nombre"), (String) json_coberturas.get("descripcion"));
                }
                seguros.add(seguro);
                
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
    
    public boolean existUsuario(String nombre, String email){
        for(int i=0; i<usuarios.size();i++){
            if(this.usuarios.get(i).getNombre().equals(nombre)| this.usuarios.get(i).getEmail().equals(email) ){
                return true;
            }
        }
        return false;
    }
    
    public boolean existServicio(String nombre){
        for(int i=0; i<servicios.size();i++){
            if(this.servicios.get(i).getNombreServicio().compareTo(nombre)==0){
                return true;
            }
        }
        return false;
    }
    
    public boolean existSeguro(String nombre){
        for(int i=0; i<seguros.size();i++){
            if(this.seguros.get(i).getNombreSeguro().compareTo(nombre)==0){
                return true;
            }
        }
        return false;
    }

    public boolean inicioUsuario(String nombre, String contraseña) {
        for(int i=0; i<usuarios.size();i++){
            if(this.usuarios.get(i).getNombre().equals(nombre) && this.usuarios.get(i).getContraseña().equals(contraseña)){
                return true;
            }
        }
        return false;
    }

    public boolean addUsuario(String nombre, String contraseña, String email, String telefono) {
        if (existUsuario(nombre, email) == true) {
            return false;
        } else {
            this.usuarios.add(new Usuario(email, contraseña, nombre, telefono));
            return true;
        }   
    }
    
    public Usuario getUsuario(String nombre) {
       for(int i=0; i<usuarios.size();i++){
            if(this.usuarios.get(i).getNombre().equals(nombre)){
                return this.usuarios.get(i);
            }
        }
        return null;
    }
    
    public Oficina getOficina(String direccion) {
        for(int i=0; i<oficinas.size();i++){
            if(this.oficinas.get(i).getDireccion().equals(direccion)){
                return this.oficinas.get(i);
            }
        }
        return null;
    }
    
    public Date getDate(String fecha) throws java.text.ParseException{
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(fecha);
        return date;
    }
    
    public Vehiculo getVehiculo(String dir_oficina, String vehiculo){
        Oficina oficina = getOficina(dir_oficina);
        for(int i=0; i<oficina.getVehiculosDisponibles().size();i++){
            System.out.println(oficina.getVehiculosDisponibles().get(i).getModelo());
            if(oficina.getVehiculosDisponibles().get(i).getModelo().equals(vehiculo)){
                System.out.println("niki");
                return oficina.getVehiculosDisponibles().get(i);
            }
        }
        return null;
    }
    
    public Seguro getSeguro(String nombre){
        for(int i=0; i<seguros.size();i++){
            if(this.seguros.get(i).getNombreSeguro().equals(nombre)){
                return this.seguros.get(i);
            }
        }
        return null;
    }
    
    public Reserva getReserva(String usuario, String reserva){
        Usuario user = getUsuario(usuario);
        for(int i=0; i<user.getReservasRealizadas().size(); i++){
            if(user.getReservasRealizadas().get(i).toString().equals(reserva)){
                Reserva r = user.getReservasRealizadas().get(i);
                return r;
            }
        }
        return null;
    }
    
    public String DateToString(Date date){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); 
        String strDate = dateFormat.format(date);  
        return strDate;
    }
}

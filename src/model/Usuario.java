/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Juanma
 */
public class Usuario {
    private String email;
    private String contraseña;
    private String nombre;
    private float saldo = 0;
    private String telefono;
    private ArrayList<TarjetaCredito> tarjetas = new ArrayList<TarjetaCredito>();
    private ArrayList<Reserva> reservasRealizadas = new ArrayList<Reserva>();

    public ArrayList<Reserva> getReservasRealizadas() {
        return reservasRealizadas;
    }

    public Usuario(String email, String contraseña, String nombre, String telefono) {
        this.email = email;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getNombre() {
        return nombre;
    }


    public float getSaldo() {
        return saldo;
    }

    public String getTelefono() {
        return telefono;
    }

    public ArrayList<TarjetaCredito> getTarjetas() {
        return tarjetas;
    }
    
    public String[] getTarjetasArr(){
        String[] arr = new String[tarjetas.size()];
        for (int i=0; i<tarjetas.size(); i++){
            arr[i] = tarjetas.get(i).toString();
        }
        return arr;
    }
    
    public void addCreditCard(String nombrePropietario, int cvc, String numero, String fechaValidez){
        if (this.tarjetas.size() < 3){
            TarjetaCredito tarjeta = new TarjetaCredito(nombrePropietario, cvc, numero, fechaValidez);
            this.tarjetas.add(tarjeta);
        }
    }
    
    public void deleteCreditCard(TarjetaCredito tarjeta){
        for(int i=0; i<this.tarjetas.size(); i++){
            if(this.tarjetas.get(i).toString().equals(tarjeta.toString())){
                this.tarjetas.remove(tarjeta);
                break;
            }
        }
    }
    
    @Override
    public String toString(){
        String result = "";
        result += this.nombre;
        return result;
    }
}

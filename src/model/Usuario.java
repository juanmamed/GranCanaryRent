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

    public ArrayList<Reserva> getReservasRealizadas() {
        return reservasRealizadas;
    }
    
    public String[] getReservasArr(){
        String[] arr = new String[reservasRealizadas.size()];
        for (int i=0; i<reservasRealizadas.size(); i++){
            arr[i] = reservasRealizadas.get(i).toString();
        }
        return arr;
    }
    
    public String[] getReservasSinPagarArr(){
        int contador = 0;
        for (int i=0; i<reservasRealizadas.size(); i++){
            if (reservasRealizadas.get(i).isPagado() == false){
                contador++;
            }
        }
        String[] arr = new String[contador];
        contador = 0;
        for (int i=0; i<reservasRealizadas.size(); i++){
            if (reservasRealizadas.get(i).isPagado() == false){
                arr[contador] = reservasRealizadas.get(i).toString();
                contador++;
            }
        }
        return arr;
    }
    
    public boolean addCreditCard(String nombrePropietario, int cvc, String numero, String fechaValidez){
        if (this.tarjetas.size() < 3){
            TarjetaCredito tarjeta = new TarjetaCredito(nombrePropietario, cvc, numero, fechaValidez);
            this.tarjetas.add(tarjeta);
            return true;
        }
        return false;
    }
    
    public void deleteCreditCard(TarjetaCredito tarjeta){
        for(int i=0; i<this.tarjetas.size(); i++){
            if(this.tarjetas.get(i).toString().equals(tarjeta.toString())){
                this.tarjetas.remove(tarjeta);
                break;
            }
        }
    }
    
    public void addReserva(Reserva r){
        this.reservasRealizadas.add(r);
    }
    
    public void addCredit(float credit){
        this.saldo += credit;
    }
    
    public void substractCredit(float credit){
        this.saldo -= credit;
    }
    
    @Override
    public String toString(){
        String result = "";
        result += this.nombre;
        return result;
    }
}

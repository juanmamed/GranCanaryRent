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
    private LocalDate fechaNacimiento;
    private float saldo = 0;
    private Telefono numero;
    private ArrayList<TarjetaCredito> tarjetas = new ArrayList<TarjetaCredito>();
    private ArrayList<Reserva> reservasRealizadas = new ArrayList<Reserva>();

    public ArrayList<Reserva> getReservasRealizadas() {
        return reservasRealizadas;
    }

    public Usuario(String email, String contraseña, String nombre, LocalDate fechaNacimiento, Telefono numero) {
        this.email = email;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.numero = numero;
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public float getSaldo() {
        return saldo;
    }

    public Telefono getNumero() {
        return numero;
    }

    public ArrayList<TarjetaCredito> getTarjetas() {
        return tarjetas;
    }
    
    public void addCreditCard(String nombrePropietario, int cvc, String numero, String fechaValidez){
        if (this.tarjetas.size() < 3){
            TarjetaCredito tarjeta = new TarjetaCredito(nombrePropietario, cvc, numero, fechaValidez);
            this.tarjetas.add(tarjeta);
        }
    }
    
    @Override
    public String toString(){
        String result = "";
        result += this.nombre;
        return result;
    }
}

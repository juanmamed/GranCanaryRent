package model;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Juanma
 */
public class Reserva {
    private Oficina oficinaRecogida;
    private Oficina oficinaEntrega;
    private Date fechaRecogida;
    private Date fechaEntrega;
    private Vehiculo vehiculoReservado;
    private Seguro seguroSeleccionado;
    private ArrayList<Servicio> serviciosSeleccionados;
    private float precio;
    private boolean pagado;
    private int id;

    public Reserva(Oficina oficinaRecogida, Oficina oficinaEntrega, Date fechaRecogida, Date fechaEntrega) {
        this.oficinaRecogida = oficinaRecogida;
        this.oficinaEntrega = oficinaEntrega;
        this.fechaRecogida = fechaRecogida;
        this.fechaEntrega = fechaEntrega;
    }

    
    public Oficina getOficinaRecogida() {
        return oficinaRecogida;
    }

    public Oficina getOficinaEntrega() {
        return oficinaEntrega;
    }

    public Date getFechaRecogida() {
        return fechaRecogida;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public float getPrecio() {
        return precio;
    }

    public boolean isPagado() {
        return pagado;
    }

    public int getId() {
        return id;
    }

    public Vehiculo getVehiculoReservado() {
        return vehiculoReservado;
    }

    public void setVehiculoReservado(Vehiculo vehiculoReservado) {
        this.vehiculoReservado = vehiculoReservado;
    }

    public Seguro getSeguroSeleccionado() {
        return seguroSeleccionado;
    }

    public void setSeguroSeleccionado(Seguro seguroSeleccionado) {
        this.seguroSeleccionado = seguroSeleccionado;
    }

    public ArrayList<Servicio> getServiciosSeleccionados() {
        return serviciosSeleccionados;
    }

    public void setServiciosSeleccionados(ArrayList<Servicio> serviciosSeleccionados) {
        this.serviciosSeleccionados = serviciosSeleccionados;
    }
    
    

    public void setOficinaRecogida(Oficina oficinaRecogida) {
        this.oficinaRecogida = oficinaRecogida;
    }

    public void setOficinaEntrega(Oficina oficinaEntrega) {
        this.oficinaEntrega = oficinaEntrega;
    }

    public void setFechaRecogida(Date fechaRecogida) {
        this.fechaRecogida = fechaRecogida;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}

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
    private ArrayList<Servicio> serviciosSeleccionados = new ArrayList<Servicio>();
    private double precio;
    private boolean pagado;
    private int id;

    public Reserva(Oficina oficinaRecogida, Oficina oficinaEntrega, Date fechaRecogida, Date fechaEntrega) {
        this.oficinaRecogida = oficinaRecogida;
        this.oficinaEntrega = oficinaEntrega;
        this.fechaRecogida = fechaRecogida;
        this.fechaEntrega = fechaEntrega;
    }

    public Reserva(Oficina oficinaRecogida, Oficina oficinaEntrega, Date fechaRecogida, Date fechaEntrega, Vehiculo vehiculoReservado, Seguro seguroSeleccionado, double precio, boolean pagado, int id) {
        this.oficinaRecogida = oficinaRecogida;
        this.oficinaEntrega = oficinaEntrega;
        this.fechaRecogida = fechaRecogida;
        this.fechaEntrega = fechaEntrega;
        this.vehiculoReservado = vehiculoReservado;
        this.seguroSeleccionado = seguroSeleccionado;
        this.precio = precio;
        this.pagado = pagado;
        this.id = id;
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

    public double getPrecio() {
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

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString(){
        String result = "";
        result += "Reserva con ID: " + this.id;
        return result;
    }
    
    public String toStringServicios(){
        String result = "";
        if (this.serviciosSeleccionados.size() == 0){
            result = "Sin servicios";
            return result;
        }
        for(int i=0; i<this.serviciosSeleccionados.size(); i++){
            result += this.serviciosSeleccionados.get(i).getNombreServicio() + ",";
        }
        return result.substring(result.length()-1);
    }
    
    public String toStringEstado(){
        String result = "";
        if (this.isPagado()){
            result = "Pagado";
            return result;
        }
        result = "Sin Pagar";
        return result;
    }
}

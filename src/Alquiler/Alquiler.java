/*
el nombre, documento del cliente, la fecha de alquiler, fecha de
devolución, la posición del amarre y el barco que lo ocupará.
 */
package Alquiler;

import Barco.Barco;
import java.util.Date;


/**
 *
 * @author nobil
 */
public class Alquiler {

   private String nombre;
   private Long dni;
    private Date fechaActual;
    private Date fechaDevolucion;
    private Integer posicionAmarre;
    private Barco barco;
private Double montoAlquiler;
    public Alquiler() {
           }

    public Alquiler(String nombre, Long dni, Date fechaActual, Date fechaDevolucion, Integer posicionAmarre, Barco barco, Double montoAlquiler) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaActual = fechaActual;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
        this.montoAlquiler = montoAlquiler;
    }
  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Integer getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(Integer posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Date getFechaActual() {
        return fechaActual;
    }

    public void setFechaActual(Date fechaActual) {
        this.fechaActual = fechaActual;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }
 
    public Double getMontoAlquiler() {
        return montoAlquiler;
    }

    public void setMontoAlquiler(Double montoAlquiler) {
        this.montoAlquiler = montoAlquiler;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", dni=" + dni + ", fechaActual=" + fechaActual + ", fechaDevolucion=" + fechaDevolucion + ", posicionAmarre=" + posicionAmarre + ", barco=" + barco + ", montoAlquiler=" + montoAlquiler + '}';
    }

   
   
}
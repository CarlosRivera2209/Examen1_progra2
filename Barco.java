
package examen1_progra2;

import java.time.LocalDate;

abstract class Barco {

    private final String nombre;
    private final LocalDate fechaPuestaEnCirculacion;

    public Barco(String nombre) {
        this.nombre = nombre;
        this.fechaPuestaEnCirculacion = LocalDate.now();
    }

    public final String getNombre() {
        return nombre;
    }

    public final LocalDate getFechaPuestaEnCirculacion() {
        return fechaPuestaEnCirculacion;
    }

    public abstract void agregarElemento();

    public abstract double vaciarCobrar();

    public abstract double precioElemento();

    
    public String toString() {
        return nombre;
    }
    
    
}

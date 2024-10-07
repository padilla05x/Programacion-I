package co.edu.uniquindio.poo.model;

import java.util.Collection;
import java.util.LinkedList;

public class Estudiante extends Persona {
    public Collection<Prestamo> listaPrestamos;

    /**
    * Constructor
    */
    public Estudiante(String nombre, String cedula, String telefono, String correo){
        super(nombre, cedula, telefono, correo);
        listaPrestamos = new LinkedList<>();
    }

    /**
     * Getters y Setters
     */
    public Collection<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos(Collection<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }
}
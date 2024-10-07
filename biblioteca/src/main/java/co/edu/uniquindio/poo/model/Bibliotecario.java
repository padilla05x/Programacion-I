package co.edu.uniquindio.poo.model;

import java.util.Collection;
import java.util.LinkedList;
import java.time.LocalDate;

public class Bibliotecario extends Persona{
    private double salario;
    private int anioIngreso;
    public Collection<Prestamo> listaPrestamos;

    /**
    * Constructor
    */
    public Bibliotecario(String nombre, String cedula, String telefono, String correo, double salario, int anioIngreso){
    super(nombre,cedula,telefono,correo);
    this.salario = salario;
    this.anioIngreso = anioIngreso;
    listaPrestamos = new LinkedList<>();
    }

    /**
    * Getters y Setters
    */
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public Collection<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos(Collection<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }

    /**
    * Metodo que muestra la cantidad de prestamos que tiene un empleado
    */
    public int cantidadPrestamos() {
        return listaPrestamos.size();
     }


    /**
    * Metodod que calcula la antiguedad de un empleado
    */
    public int calcularAntiguedad(){
        return LocalDate.now().getYear() - anioIngreso;
    }

}


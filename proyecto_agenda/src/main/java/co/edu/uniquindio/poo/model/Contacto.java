package co.edu.uniquindio.poo.model;

import java.util.Objects;

public class Contacto {

    private String nombre;
    private String alias;
    private String direccion;
    private String telefono;
    private String email;

    public Contacto(String nombre, String alias, String direccion, String telefono, String email) {
        this.nombre = nombre;
        this.alias = alias;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    // Comparar dos contactos (nombre y telefono)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacto contacto = (Contacto) o;
        return nombre.equals(contacto.nombre) && telefono.equals(contacto.telefono);
    }


    // Genera un código hash para el contacto.
    @Override
    public int hashCode() {
        return Objects.hash(nombre, telefono);
    }


    // Metodo para devolver toda la info en una cadena de texto
    @Override
    public String toString() {
        return "\nnombre: " + nombre + ", alias: " + alias + ", direccion: " + direccion + ", telefono: " + telefono + ", email: " + email;
    }

    
}

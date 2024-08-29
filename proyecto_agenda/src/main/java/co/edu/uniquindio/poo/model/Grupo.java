package co.edu.uniquindio.poo.model;

import java.util.Arrays;

public class Grupo {

    private String nombre;
    private Categoria categoria;
    private Contacto[] contactos;
    private int numContactos;

    public Grupo(String nombre, Categoria categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.contactos = new Contacto[5]; // Arreglo de tamaño máximo 5
        this.numContactos = 0;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Contacto[] getContactos() {
        return contactos;
    }

    public void setContactos(Contacto[] contactos) {
        this.contactos = contactos;
    }

    // Método para agregar un contacto al grupo
    public String agregarContacto(Contacto contacto) {
        if (numContactos < 5) {
            for (int i = 0; i < numContactos; i++) {
                if (contactos[i].equals(contacto)) {
                    return "El contacto ya está en el grupo.";
                }
            }
            contactos[numContactos++] = contacto;
            return "Contacto agregado al grupo.";
        } else {
            return "El grupo ya tiene el máximo de 5 contactos.";
        }
    }

    // Método para eliminar un contacto del grupo
    public String eliminarContacto(String telefono) {
        String mensaje = "El contacto no existe en el grupo.";

        for (int i = 0; i < numContactos; i++) {
            Contacto contactoAux = contactos[i];
            if (contactoAux.getTelefono().equals(telefono)) {
                contactos [i] = null;
                mensaje = "El contacto ha sido eliminado del grupo";
                return mensaje;
            }
        }
        return mensaje;
    }

    @Override
    public String toString() {
        return "Grupo{" +
                "nombre='" + nombre + '\'' +
                ", categoria=" + categoria +
                ", contactos=" + Arrays.toString(contactos) +
                '}';
    }
}

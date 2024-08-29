package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reunión {

    private String descripcion;
    private Date fecha;
    private String hora;
    private List<Contacto> listaContactosAsistentes;

    public Reunión(String descripcion, Date fecha, String hora) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.listaContactosAsistentes = new ArrayList<>();
    }

    // Getters y Setters
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public List<Contacto> getListaContactosAsistentes() {
        return listaContactosAsistentes;
    }

    // Método para asignar contactos asistentes a una reunión
    public String agregarAsistente(Contacto contacto) {
        if (!listaContactosAsistentes.contains(contacto)) {
            listaContactosAsistentes.add(contacto);
            return "Contacto agregado a la reunión.";
        } else {
            return "El contacto ya está en la lista de asistentes.";
        }
    }

    // Método para eliminar contactos asistentes a una reunión
    public String eliminarAsistente(Contacto contacto) {
        if (listaContactosAsistentes.remove(contacto)) {
            return "Contacto eliminado de la reunión.";
        } else {
            return "El contacto no está en la lista de asistentes.";
        }
    }

    @Override
    public String toString() {
        return "descripcion: " + descripcion +", fecha: " + fecha +", hora: " + hora +", Contactos asistentes: " + listaContactosAsistentes +'}';
    }
}


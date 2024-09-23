package co.edu.uniquindio.poo.model;

import java.util.Date;
import java.util.LinkedList;

public class Biblioteca {
    private String nombre;
    private LinkedList<Libro> listaLibros = new LinkedList<>();
    private LinkedList<Prestamo> listaPrestamos = new LinkedList<>();
    private LinkedList<Persona> listaPersonas = new LinkedList<>();

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.listaLibros = new LinkedList<>();
        this.listaPrestamos = new LinkedList<>();
        this.listaPersonas = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(LinkedList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public LinkedList<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos(LinkedList<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }

    public LinkedList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(LinkedList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }


    /*
     * Este método almacena un nuevo Libro, solo si el libro aún no ha sido registrado.
     */
    public String crearLibro(Libro nuevoLibro) {
        String mensaje = "";

        if (buscarLibro(nuevoLibro.getCodigo()) != null) {
            mensaje = "\nEl Libro ya se encuentra registrado.";
        } else {
            listaLibros.add(nuevoLibro);
            mensaje = "\nEl Libro se ha almacenado exitosamente.";
        }

        return mensaje;
    }

    /*
     * Este método busca un Libro en base a su código.
     */
    public Libro buscarLibro(String codigo) {
        for (Libro libro : listaLibros) {
            if (libro != null && libro.getCodigo().equals(codigo)) {
                return libro;
            }
        }
        return null;
    }

    /*
     * Este método elimina un Libro, si lo encuentra.
     */
    public String eliminarLibro(String codigo) {
        for (Libro libro : listaLibros) {
            if (libro != null && libro.getCodigo().equals(codigo)) {
                listaLibros.remove(libro);
                return "\nEl Libro ha sido eliminado correctamente.";
            }
        }
        return "\nEl Libro no existe.";
    }

    /*
     * Este método actualiza la información de un libro, si lo encuentra.
     */
    public String actualizarLibro(String titulo, String codigo, String isbn, String autor, String editorial, String fecha, byte disponibilidad) {
        Libro libroEncontrado = buscarLibro(codigo);
        if (libroEncontrado != null) {
            libroEncontrado.setTitulo(titulo);
            libroEncontrado.setCodigo(codigo);
            libroEncontrado.setIsbn(isbn);
            libroEncontrado.setAutor(autor);
            libroEncontrado.setEditorial(editorial);
            libroEncontrado.setFecha(fecha);
            libroEncontrado.setDisponibilidad(disponibilidad);

            return "\nLa información del libro ha sido actualizada correctamente.";
        }
        return "\nEl Libro no se encuentra registrado.";
    }


    /*
     * Este método almacena un nuevo Prestamo, solo si el Prestamo aún no ha sido registrado.
     */
    public String crearPrestamo(Prestamo nuevoPrestamo) {
        if (buscarPrestamo(nuevoPrestamo.getFechaEntrega(), nuevoPrestamo.getFechaPrestamo()) != null) {
            return "\nEl prestamo ya se encuentra registrado.";
        } else {
            listaPrestamos.add(nuevoPrestamo);
            return "\nEl Prestamo se ha almacenado exitosamente.";
        }
    }

    /*
     * Este método busca un Prestamo en base a sus fechas.
     */
    public Prestamo buscarPrestamo(Date fechaEntrega, Date fechaPrestamo) {
        for (Prestamo prestamo : listaPrestamos) {
            if (prestamo != null && prestamo.getFechaEntrega().equals(fechaEntrega) && prestamo.getFechaPrestamo().equals(fechaPrestamo)) {
                return prestamo;
            }
        }
        return null;
    }

    /*
     * Este método elimina un Prestamo, si lo encuentra.
     */
    public String eliminarPrestamo(Date fechaEntrega, Date fechaPrestamo) {
        for (Prestamo prestamo : listaPrestamos) {
            if (prestamo != null && prestamo.getFechaEntrega().equals(fechaEntrega) && prestamo.getFechaPrestamo().equals(fechaPrestamo)) {
                listaPrestamos.remove(prestamo);
                return "\nEl Prestamo ha sido eliminado correctamente.";
            }
        }
        return "\nEl Prestamo no existe.";
    }

    /*
     * Este método actualiza la información de un Prestamo, si lo encuentra.
     */
    public String actualizarPrestamo(Double costo, Date fechaEntrega, Date fechaPrestamo) {
        Prestamo prestamoEncontrado = buscarPrestamo(fechaEntrega, fechaPrestamo);
        if (prestamoEncontrado != null) {
            prestamoEncontrado.setCosto(costo);
            prestamoEncontrado.setFechaEntrega(fechaEntrega);
            prestamoEncontrado.setFechaPrestamo(fechaPrestamo);

            return "\nLa información del Prestamo ha sido actualizada correctamente.";
        }
        return "\nEl Prestamo no se encuentra registrado.";
    }


    /*
     * Este método almacena una nueva Persona, solo si el libro aún no ha sido registrado.
     */
    public String crearPersona(Persona nuevaPersona) {
        String mensaje = "";

        if (buscarPersona(nuevaPersona.getCedula()) != null) {
            mensaje = "\nLa persona ya se encuentra registrada.";
        } else {
            listaPersonas.add(nuevaPersona);
            mensaje = "\nLa persona se ha almacenado exitosamente.";
        }

        return mensaje;
    }


    /*
     * Este método busca una Persona en base a su número de cedula.
     */
    public Persona buscarPersona(String cedula) {
        for (Persona persona : listaPersonas) {
            if (persona != null && persona.getCedula().equals(cedula)) {
                return persona;
            }
        }
        return null;
    }


    /*
     * Este método elimina una Persona, si la encuentra.
     */
    public String eliminarPersona(String cedula) {
        for (Persona persona : listaPersonas) {
            if (persona != null && persona.getCedula().equals(cedula)) {
                listaPersonas.remove(persona);
                return "\nLa Persona ha sido eliminada correctamente.";
            }
        }
        return "\nLa Persona no existe.";
    }


    /*
     * Este método actualiza la información de una Persona, si lo encuentra.
     */
    public String actualizarPersona(String nombre, String cedula, String telefono, String correo) {
        Persona personaEncontrada = buscarPersona(cedula);
        if (personaEncontrada != null) {
            personaEncontrada.setNombre(nombre);
            personaEncontrada.setCedula(cedula);
            personaEncontrada.setTelefono(telefono);
            personaEncontrada.setCorreo(correo);

            return "\nLa información de la Persona ha sido actualizada correctamente.";
        }
        return "\nLa Persona no se encuentra registrada.";
    }
}

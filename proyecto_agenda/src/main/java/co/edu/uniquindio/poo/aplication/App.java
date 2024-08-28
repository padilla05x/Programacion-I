package co.edu.uniquindio.poo.aplication;

import co.edu.uniquindio.poo.model.Contacto;
import co.edu.uniquindio.poo.model.Grupo;
import co.edu.uniquindio.poo.model.Reunión;

import javax.swing.JOptionPane;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        // Crear contactos
        Contacto contacto1 = new Contacto("Juan Pérez", "JP", "Calle 12", "123456789", "juan@example.com");
        Contacto contacto2 = new Contacto("María Gómez", "MG", "Avenida 456", "987654321", "maria@example.com");


        // Mostrar los contactos en ventanas flotantes
        JOptionPane.showMessageDialog(null, "Contacto 1: " + contacto1);
        JOptionPane.showMessageDialog(null, "Contacto 2: " + contacto2);

        // Crear un grupo
        Grupo grupoAmigos = new Grupo("Amigos", Grupo.Categoria.AMIGOS);
        System.out.println(grupoAmigos.agregarContacto(contacto1));
        System.out.println(grupoAmigos.agregarContacto(contacto2));

        // Mostrar el grupo en la consola
        System.out.println("Grupo: " + grupoAmigos);

        // Crear una reunión
        Reunión reunión = new Reunión("Reunión de Amigos", new Date(), "10:00 AM");
        System.out.println(reunión.agregarAsistente(contacto1));
        System.out.println(reunión.agregarAsistente(contacto2));

        // Mostrar la reunión en la consola
        System.out.println("Reunión: " + reunión);
    }
}


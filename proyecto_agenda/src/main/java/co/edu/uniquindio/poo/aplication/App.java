package co.edu.uniquindio.poo.aplication;

import co.edu.uniquindio.poo.model.Categoria;
import co.edu.uniquindio.poo.model.Contacto;
import co.edu.uniquindio.poo.model.Grupo;
import co.edu.uniquindio.poo.model.Reunión;

import javax.swing.JOptionPane;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        // Crear contactos
        Contacto contacto1 = new Contacto("Juan Pérez", "JP", "Calle 12", "123456789", "juan@uqvirtual.com");
        Contacto contacto2 = new Contacto("María Gómez", "MG", "Avenida 456", "987654321", "maria@uqvirtual.com");
        Contacto contacto3 = new Contacto("Michelle", "Mich", "Carrea 19", "318411", "michelle@uqvirtual.com");


        // Mostrar los contactos en ventanas flotantes
        JOptionPane.showMessageDialog(null, "Contacto 1: " + contacto1);
        JOptionPane.showMessageDialog(null, "Contacto 2: " + contacto2);
        JOptionPane.showMessageDialog(null, "Contacto 3: " + contacto3);

        // Crear un grupo
        Grupo grupoAmigos = new Grupo("Amigos", Categoria.AMIGOS);
        System.out.println(grupoAmigos.agregarContacto(contacto1));
        System.out.println(grupoAmigos.agregarContacto(contacto2));
        System.out.println(grupoAmigos.agregarContacto(contacto3));

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


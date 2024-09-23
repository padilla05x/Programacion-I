package co.edu.uniquindio.poo.model;

public class Bibliotecario extends Persona {
    private String salario;

    public Bibliotecario(String salario, String nombre, String cedula, String telefono, String correo) {
        super(nombre, cedula, telefono, correo);
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
    
}

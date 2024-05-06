package Modelo;

public class Persona {

    // DECLARACION DE ATRIBUTOS
    protected String nombre;

    // CREACION DEL CONTRUCTOR
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    // CREACION DE LOS METODOS GET Y SET
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}

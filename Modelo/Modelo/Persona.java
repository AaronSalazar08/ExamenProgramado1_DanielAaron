package Modelo;

public class Persona {

    //DECLARACION DE ATRIBUTOS
    protected String nombre;
   

    //CREACION DEL CONSTRUCTOR
    public Persona(String nombre) {
        this.nombre = nombre;
        
    }

    //CREACION DE METODOS GET Y SET
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
}

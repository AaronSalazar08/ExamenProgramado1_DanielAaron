package Modelo;

public class Persona {
    
    public String nombre; 
    public String cedula;

    

    
    public Persona() {
    }


    public Persona(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }



    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String getCedula() {
        return cedula;
    }



    public void setCedula(String cedula) {
        this.cedula = cedula;
    }







}

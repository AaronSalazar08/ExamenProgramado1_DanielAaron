package Modelo;

public class Persona {

    //DECLARACION DE ATRIBUTOS
    protected String nombre;
    protected String cedula;
    protected String sexo;
    protected int edad;

    
    public Persona(String nombre, String cedula, String sexo, int edad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.sexo = sexo;
        this.edad = edad;
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


    public String getSexo() {
        return sexo;
    }


    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
   

    
   
}

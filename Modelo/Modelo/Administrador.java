package Modelo;

public class Administrador extends Persona {

    //DECLARACION DE ATRIBUTOS
    protected String contraseña;

    //CREACION DEL CONSTRUCTOR
    public Administrador(String nombre, String contraseña) {
        super(nombre);
        this.contraseña = contraseña;
    }

    //CREACION DE LOS METODOS GET Y SET
    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}

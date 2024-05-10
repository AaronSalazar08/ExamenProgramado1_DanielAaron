package Modelo;




public class Administrador extends Persona {

    //DECLARACION DE ATRIBUTOS
    private  String contraseña;
   

    

    //Creacion de metodo constructor con parametros

    public Administrador(String nombre,  String contraseña) {
        super(nombre);
        this.contraseña = contraseña;
    }

    //Creacion de Setter y getter


    public String getContraseña() {
        return contraseña;
    }


    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }


}

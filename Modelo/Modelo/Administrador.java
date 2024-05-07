package Modelo;




public class Administrador extends Persona {

    private  String contraseña;
   

    


    public Administrador(String nombre,  String contraseña) {
        super(nombre);
        this.contraseña = contraseña;
    }


    public String getContraseña() {
        return contraseña;
    }


    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }


}

package Modelo;

public class Administrador extends Persona {

    //DECLARACION DE ATRIBUTOS
    protected String carnet;

    //CREACION DEL CONTRUCTOR
    public Administrador(String nombre, String carnet){
        super(nombre);
        this.carnet = carnet;
    }


    //CREACION DE METODOS GET Y SET
    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    
    
}

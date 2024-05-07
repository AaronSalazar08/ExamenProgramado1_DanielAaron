package Modelo;

public class Paciente extends Persona {

    //DECLARACION DE ATRIBUTOS
    protected String cedula;
    protected String transtorno;
    protected String sexo;
    protected int edad;

    //CREACION DEL CONSTRUCTOR
    public Paciente(String nombre, String cedula, String transtorno, String sexo, int edad) {
        super(nombre);
        this.cedula = cedula;
        this.transtorno = transtorno;
        this.sexo = sexo;
        this.edad = edad;
    }

    //CREACION DE LOS METODOS GET Y SET
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTranstorno() {
        return transtorno;
    }

    public void setTranstorno(String transtorno) {
        this.transtorno = transtorno;
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
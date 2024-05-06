package Modelo;

public class Paciente extends Persona {

    //DECLARACION DE ATRIBUTOS
    protected int edad, cedula;
    protected String transtorno, sexo;

    //CREACION DEL CONTRUCTOR CON LA HERENCIA DE CLASE PERSONA
    public Paciente(String nombre, String transtorno, String sexo, int edad, int cedula) {
        super(nombre);
        this.transtorno = transtorno;
        this.sexo = sexo;
        this.edad = edad;
        this.cedula = cedula;

    }

    //CREACION DE METODOS GET Y SET
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
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

    

}

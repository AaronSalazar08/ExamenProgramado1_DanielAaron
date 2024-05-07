package Controlador;




import java.util.ArrayList;

import Modelo.Administrador;
import Modelo.Paciente;
import Modelo.Persona;

import Vista.RegistroAdmin;


public class Principal {

    public static ArrayList<Paciente> listaPacientes = new ArrayList<>();
    public static ArrayList<Administrador> listaAdmin = new ArrayList<>();

    public static void main(String[] args) {


        RegistroAdmin puenteRegistro = new RegistroAdmin();
        puenteRegistro.setVisible(true);
        

        


    }

}

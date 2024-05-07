package Controlador;

import java.util.ArrayList;

import Modelo.Paciente;
import Vista.RegistroAdmin;
import Vista.MenuPrimeraVista;

public class Principal {

public static ArrayList<Paciente> empleados = new ArrayList<>();


    public static void main(String[] args) {

        MenuPrimeraVista puenteRegistro = new MenuPrimeraVista();
        puenteRegistro.setVisible(true);
        
        

       
    }

}

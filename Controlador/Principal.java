package Controlador;

import java.util.ArrayList;


import Vista.MenuPrimeraVista;



public class Principal {

public static ArrayList<Paciente> empleados = new ArrayList<>();


    public static void main(String[] args) {

        
        MenuPrimeraVista instancia = new MenuPrimeraVista();
        instancia.setVisible(true);
        

       
    }

}

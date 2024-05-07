package Controlador;



import java.util.ArrayList;

import Modelo.Persona;

import Vista.RegistroAdmin;


import Vista.MenuPrimeraVista;

public class Principal {

    public static ArrayList<Persona> listaPersonas = new ArrayList<>();

    public static void main(String[] args) {


        MenuPrimeraVista puenteRegistro = new MenuPrimeraVista();
        puenteRegistro.setVisible(true);
        
        

        MenuPrimeraVista instancia = new MenuPrimeraVista();
        instancia.setVisible(true);


    }

}

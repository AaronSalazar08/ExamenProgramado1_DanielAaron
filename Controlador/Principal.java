package Controlador;




import java.util.ArrayList;

import Modelo.Administrador;
import Modelo.Paciente;
import Vista.MenuPrimeraVista;


public class Principal {

    public static ArrayList<Paciente> listaPacientes = new ArrayList<>();
    public static ArrayList<Administrador> listaAdmin = new ArrayList<>();

    public static void main(String[] args) {


        MenuPrimeraVista puenteMenu = new MenuPrimeraVista();
        puenteMenu.setVisible(true);
        

        


    }

}

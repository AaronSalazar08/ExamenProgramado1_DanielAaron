package Controlador;

import java.util.ArrayList;

import Modelo.Paciente;
import Modelo.Administrador;
import Vista.RegistroAdmin;

import Vista.MenuPrimeraVista;

public class Principal {

    public static ArrayList<Paciente> listaPacientes = new ArrayList<>();
    public static ArrayList<Administrador> administradores = new ArrayList<>();

    public static void main(String[] args) {

        MenuPrimeraVista puenteRegistro = new MenuPrimeraVista();
        puenteRegistro.setVisible(true);

    
    }

}

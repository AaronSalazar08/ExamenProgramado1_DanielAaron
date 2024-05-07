package Controlador;

import Modelo.Administrador;
import Modelo.Paciente;

public class Metodos {


    public static void RegistrarPacientes (String nombre, String cedula, String transtorno, String sexoMasculino, int edad){

        Principal.listaPacientes.add(new Paciente(nombre, cedula, transtorno, sexoMasculino, edad));

    }

    public static void RegistrarAdministradores (String nombre, String contraseña){

        Principal.listaAdmin.add(new Administrador(nombre, contraseña));

    }


}

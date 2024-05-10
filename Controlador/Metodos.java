package Controlador;

import Modelo.Administrador;
import Modelo.Paciente;
import Vista.ResultadosPaciente;

public class Metodos {

    public static void RegistrarPacientes(String nombre, String cedula, String transtorno, String sexo,
            int edad) {

        Principal.listaPacientes.add(new Paciente(nombre, cedula, transtorno, sexo, edad));

    }

}

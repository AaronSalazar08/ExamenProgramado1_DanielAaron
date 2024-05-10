package Controlador;




import java.util.ArrayList;


import Modelo.Paciente;
import Modelo.Persona;
import Vista.MenuPrimeraVista;
import Vista.LoginAdmin;


public class Principal {

    //Creacion de Arraylist para la clase paciente 
    public static ArrayList<Paciente> listaPacientes = new ArrayList<>();
<<<<<<< HEAD

    //Cracion de Arraylist para la clase Administrativo
    public static ArrayList<Administrador> listaAdmin = new ArrayList<>();
=======
>>>>>>> 4fe18118cd9d22c0ddf1be18548d28a11ca1cbc3

    public static void main(String[] args) {


        //Creacion de instancia para llamar al JFrame del menú principal 
        
        MenuPrimeraVista menuPrimeraVista = new MenuPrimeraVista();
        menuPrimeraVista.setVisible(true);
        

        


    }

}

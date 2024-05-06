package Vista;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class IngresoAdministrador  extends JFrame{

    private JPanel panelIngresoAdministrador = new JPanel();
    private JLabel nombreAdministradorJLabel, carnetAdministradorJLabel;
    private JTextField nombreAdministradorJTextField, canertAdministradorJTextField;

public IngresoAdministrador(){

     // Ajustes para la ventana
     this.setTitle("Iniciar Sesion del Administrador");
     this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
     this.setLocationRelativeTo(null);
     this.setSize(800, 800);
     setLocationRelativeTo(null);
     this.getContentPane().add(panelIngresoAdministrador);
     panelIngresoAdministrador.setBackground(new Color(119, 176, 178));
     panelIngresoAdministrador.setLayout(null);
     Elementos();// llamada al metodo de elementos para agregar los elementos del panel a la
                 // interfaz grafica

}

public void Elementos(){


}

}

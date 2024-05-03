package Vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import  java.awt.Color;
import java.awt.Font;






public class MenuPrimeraVista extends JFrame {

public JPanel panelPrimeraVista  = new JPanel ();
public  JButton botonAdministrativo, botonPaciente;
public JLabel fraseLabel, indicacionesLabel, tituloLabel;


public MenuPrimeraVista (){
    this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    this.setLocationRelativeTo(null);
    this.setSize(800, 800);
    this.setContentPane(panelPrimeraVista);
    panelPrimeraVista.setBackground(new Color(119, 176, 178));
	setLocationRelativeTo(null);
	panelPrimeraVista.setLayout(null);

    Elementos ();
}

public void Elementos () {
//Creación de Elementos 

//JLabel 
        tituloLabel = new JLabel("Centro de Apoyo Solís Salazar");
       tituloLabel.setBounds(220, 20, 400, 70);
		Font fuente1 = new Font("Century Schoolbook", Font.PLAIN, 24); //
        tituloLabel.setFont(fuente1);
       tituloLabel.setForeground(new Color(81, 33, 176));

        







        //Agregar elementos al panel

        panelPrimeraVista.add(tituloLabel);
        






}


}

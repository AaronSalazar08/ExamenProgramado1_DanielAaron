package Vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;


public class RegistroAdmin  extends JFrame implements ActionListener{


    JPanel panelRegistro = new JPanel();

    JLabel RegistroLabel ;
    JLabel labelAdmin;
    JLabel labelContraseña;

    JButton botonAceptar ;
    JButton botonSalir;
    JTextField nombreAdmin;
    JTextField areaContraseña;



    public RegistroAdmin (){
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(400, 400);
        this.setContentPane(panelRegistro);
        panelRegistro.setBackground(new Color(119, 176, 178));
        setLocationRelativeTo(null);
        panelRegistro.setLayout(null);


        Elementos ();


    }

    public void Elementos (){

        RegistroLabel = new JLabel("Registro de administrador");
        RegistroLabel.setBounds(5, 1, 400, 70);
        Font fuente1 = new Font("Century Schoolbook", Font.PLAIN, 16); //
        RegistroLabel.setFont(fuente1);
        RegistroLabel.setForeground(new Color(81, 33, 176));

        labelAdmin = new JLabel("Ingrese el nombre de la persona encargada");
        labelAdmin.setBounds(5, 50, 400, 60);
        Font fuente2= new Font("Century Schoolbook", Font.PLAIN, 14); //
        labelAdmin.setFont(fuente2);
        labelAdmin.setForeground(new Color(81, 33, 176));

        nombreAdmin = new JTextField();
        nombreAdmin.setBounds(5,50,100,40);


       











        panelRegistro.add(RegistroLabel);
        panelRegistro.add(labelAdmin);
        panelRegistro.add(nombreAdmin);
        


    }





public void actionPerformed(ActionEvent e) {
		


if (e.getSource() == botonSalir) {
    JOptionPane.showMessageDialog(null, "Regresando al menú principal");
   MenuPrimeraVista instanciaInicio =  new MenuPrimeraVista();
    instanciaInicio.setVisible(true);
    this.dispose();

    

    


} else if (e.getSource() == botonAceptar) {
    JOptionPane.showMessageDialog(null, "Registrado exitosamente \n Mostrando Resultados");
   ResultadosPaciente resultados = new ResultadosPaciente();
    resultados.setVisible(true);
    this.dispose();


}

}







    
}

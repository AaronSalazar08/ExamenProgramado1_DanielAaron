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

    JButton botonRegistrar ;
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

        //Añadir constantes

        //JLabel

        RegistroLabel = new JLabel("Registro de administrador");
        RegistroLabel.setBounds(5, 1, 400, 70);
        Font fuente1 = new Font("Century Schoolbook", Font.PLAIN, 16); //
        RegistroLabel.setFont(fuente1);
        RegistroLabel.setForeground(new Color(81, 33, 176));

        labelAdmin = new JLabel("Ingrese el nombre de la persona encargada");
        labelAdmin.setBounds(46, 50, 400, 60);
        Font fuente2= new Font("Century Schoolbook", Font.PLAIN, 14); //
        labelAdmin.setFont(fuente2);
        labelAdmin.setForeground(new Color(81, 33, 176));

        labelContraseña = new JLabel("Ingrese la contraseña a utilizar");
        labelContraseña.setBounds(80, 150, 400, 60);
        Font fuente3 = new Font("Century Schoolbook", Font.PLAIN, 14); //
        labelContraseña.setFont(fuente3);
        labelContraseña.setForeground(new Color(81, 33, 176));

        //JTexField


        nombreAdmin = new JTextField();
        nombreAdmin.setBounds(60,100,250,20);

        areaContraseña = new JTextField();
        areaContraseña.setBounds(60,200,250,20);

        //JButton

        botonRegistrar = new JButton("Registrar");
        botonRegistrar.setBounds(270,300,100,30);
        botonRegistrar.addActionListener(this);

        botonSalir = new JButton("Cerrar Prog.");
        botonSalir.setBounds(20,300,110,30);
        botonSalir.addActionListener(this);









       



        panelRegistro.add(RegistroLabel);
        panelRegistro.add(labelAdmin);
        panelRegistro.add(nombreAdmin);
        panelRegistro.add(areaContraseña);
        panelRegistro.add(labelContraseña);
        panelRegistro.add(botonRegistrar);
        panelRegistro.add(botonSalir);
        


    }





public void actionPerformed(ActionEvent e) {
		


if (e.getSource() == botonSalir) {
    JOptionPane.showMessageDialog(null, "Cerrando Sistema");
    this.dispose();

    

    


} else if (e.getSource() == botonRegistrar) {
    JOptionPane.showMessageDialog(null, "Admistrador Registrado  \n Cargando Menú Principal");
   MenuPrimeraVista menu = new MenuPrimeraVista();
    menu.setVisible(true);
    this.dispose();

}

}



    
}

package Vista;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.util.ArrayList;

import Controlador.Principal;
import Modelo.Administrador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

public class RegistroAdmin extends JFrame implements ActionListener {

    JPanel panelRegistro = new JPanel();

    JLabel RegistroLabel;
    JLabel labelAdmin;
    JLabel labelContraseña;

    JButton botonRegistrar;
    JButton botonVolver;
    JTextField nombreAdmin;
    JPasswordField areaContraseña;
    Font fuente = new Font("Century Schoolbook", Font.PLAIN, 16);
    Font fuenteBoton = new Font("Century Schoolbook", Font.PLAIN, 12);

    public RegistroAdmin() {

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Inicio Sesión");
        this.setLocationRelativeTo(null);
        this.setSize(300, 300);
        this.setContentPane(panelRegistro);
        panelRegistro.setBackground(new Color(119, 176, 178));
        setLocationRelativeTo(null);
        panelRegistro.setLayout(null);

        Elementos();

    }

    public void Elementos() {

        // Añadir constantes

        // JLabel

        labelAdmin = new JLabel("Usuario");
        labelAdmin.setBounds(110, 10, 200, 60);
        labelAdmin.setFont(fuente);
       

        labelContraseña = new JLabel("Contraseña ");
        labelContraseña.setBounds(100, 90, 200, 60);
        labelContraseña.setFont(fuente);
        

        // JTexField

        nombreAdmin = new JTextField();
        nombreAdmin.setBounds(70, 60, 150, 20);
        nombreAdmin.setFont(fuente);
        areaContraseña = new JPasswordField();
        areaContraseña.setBounds(70, 140, 150, 20);
        areaContraseña.setFont(fuente);


        // JButton

        botonRegistrar = new JButton("Continuar");
        botonRegistrar.setBounds(95, 180, 100, 30);
        botonRegistrar.addActionListener(this);
        botonRegistrar.setBackground(new Color(119, 176, 178));
        botonRegistrar.setFont(fuenteBoton);

        botonVolver = new JButton();
        botonVolver.setBounds(10, 220, 65, 30);
        botonVolver.setBackground(new Color(119, 176, 178));
        botonVolver.addActionListener(this);
        ImageIcon iconoVolver = new ImageIcon("Vista/Imagenes/volver2.png");
        Image imagenVovler = iconoVolver.getImage();
        Image imagenVolverAjustada = imagenVovler.getScaledInstance(55, 40, Image.SCALE_SMOOTH);
        ImageIcon iconoVolverAjustada = new ImageIcon(imagenVolverAjustada);
        botonVolver.setIcon(iconoVolverAjustada);


        
        // panelRegistro.add(RegistroLabel);
        panelRegistro.add(labelAdmin);
        panelRegistro.add(nombreAdmin);
        panelRegistro.add(areaContraseña);
        panelRegistro.add(labelContraseña);
        panelRegistro.add(botonRegistrar);
        panelRegistro.add(botonVolver);
        

    }

    public void actionPerformed(ActionEvent e) {

        String entrada_texto1 = nombreAdmin.getText().trim();
        char[] contrasena = areaContraseña.getPassword();
        String contrasenaString = new String(contrasena);

        if (e.getSource() == botonVolver) {
           
            MenuPrimeraVista menuPrimeraVista = new MenuPrimeraVista();
            menuPrimeraVista.setVisible(true);
            this.dispose();

        } else if (entrada_texto1.isEmpty() || contrasenaString.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Complete los espacios en blanco");

        } else if (e.getSource() == botonRegistrar) {

            if (entrada_texto1.equalsIgnoreCase("Aaron") && contrasenaString.equalsIgnoreCase("123")) {

                Controlador.Metodos.RegistrarAdministradores(entrada_texto1, contrasenaString);
                JOptionPane.showMessageDialog(null, "Bienvenido Aaron" );
                VentanaOpcionesAdministrativo menu = new VentanaOpcionesAdministrativo();
                menu.setVisible(true);
                this.dispose();

            } 
            

            if (entrada_texto1.equalsIgnoreCase("Daniel") && contrasenaString.equalsIgnoreCase("456")) {

                Controlador.Metodos.RegistrarAdministradores(entrada_texto1, contrasenaString);
                JOptionPane.showMessageDialog(null, "Bienvenido Daniel" );
                VentanaOpcionesAdministrativo menu = new VentanaOpcionesAdministrativo();
                menu.setVisible(true);
                this.dispose();

            } 

            if (entrada_texto1.equalsIgnoreCase("Douglas") && contrasenaString.equalsIgnoreCase("789")) {

                Controlador.Metodos.RegistrarAdministradores(entrada_texto1, contrasenaString);
                JOptionPane.showMessageDialog(null, "Bienvenido Douglas" );
                VentanaOpcionesAdministrativo menu = new VentanaOpcionesAdministrativo();
                menu.setVisible(true);
                this.dispose();

            } 

            else if (!entrada_texto1.equalsIgnoreCase("Aaron") && !contrasenaString.equalsIgnoreCase("123") &&
            !entrada_texto1.equalsIgnoreCase("Douglas") && !contrasenaString.equalsIgnoreCase("789") && 
            !entrada_texto1.equalsIgnoreCase("Daniel") && !contrasenaString.equalsIgnoreCase("456")){

                JOptionPane.showMessageDialog(null, "Credenciales Incorrectas");
            }

        }

    }

}

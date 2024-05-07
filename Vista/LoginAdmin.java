package Vista;

import javax.swing.JPanel;
import javax.swing.JTextField;

import Controlador.Principal;
import Modelo.Administrador;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginAdmin extends JFrame implements ActionListener {

    JPanel panelLogin = new JPanel();
    JLabel RegistroLabel;
    JLabel labelAdmin;
    JLabel labelContraseña;

    JButton botonIniciar;
    JButton botonAtras;
    JTextField nombreAdmin;
    JTextField areaContraseña;

    public LoginAdmin() {
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(400, 400);
        this.setContentPane(panelLogin);
        panelLogin.setBackground(new Color(119, 176, 178));
        setLocationRelativeTo(null);
        panelLogin.setLayout(null);

        Elementos();

    }

   public void  Elementos () {
//Añadir constantes

        //JLabel

        RegistroLabel = new JLabel("Inciar Sesión");
        RegistroLabel.setBounds(5, 1, 400, 70);
        Font fuente1 = new Font("Century Schoolbook", Font.PLAIN, 16); //
        RegistroLabel.setFont(fuente1);
        RegistroLabel.setForeground(new Color(81, 33, 176));

        labelAdmin = new JLabel("Digite el nombre del Administrador");
        labelAdmin.setBounds(46, 50, 400, 60);
        Font fuente2= new Font("Century Schoolbook", Font.PLAIN, 14); //
        labelAdmin.setFont(fuente2);
        labelAdmin.setForeground(new Color(81, 33, 176));

        labelContraseña = new JLabel("Ingrese la contraseña");
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

        botonIniciar = new JButton("Aceptar");
        botonIniciar.setBounds(270,300,100,30);
        botonIniciar.addActionListener(this);
        

        botonAtras = new JButton("Atrás");
        botonAtras.setBounds(20,300,110,30);
        botonAtras.addActionListener(this);



        panelLogin.add(RegistroLabel);
        panelLogin.add(labelAdmin);
        panelLogin.add(nombreAdmin);
        panelLogin.add(areaContraseña);
        panelLogin.add(labelContraseña);
        panelLogin.add(botonIniciar);
        panelLogin.add(botonAtras);
        


    }

    public void actionPerformed(ActionEvent e) {
        String busquedaNombre = nombreAdmin.getText();
        String busquedaContraseña = areaContraseña.getText();

        if (e.getSource() == botonAtras) {
            JOptionPane.showMessageDialog(null, "¡Inicio de Sesión cancelado!");
            MenuPrimeraVista menu = new MenuPrimeraVista();
            menu.setVisible(true);
            this.dispose();

        

                }  if (e.getSource() == botonIniciar) {
                    String busqueda = nombreAdmin.getText();

		for (Administrador buscado : Principal.listaAdmin) {

			if (buscado.getNombre().equals(busqueda)) {



				JOptionPane.showMessageDialog(null, "Empleado encontrado");
				
			} 
			
			else {

				JOptionPane.showMessageDialog(null, "Empleado no encotrado");
            }
        }
                    
        }
    }

    
        }
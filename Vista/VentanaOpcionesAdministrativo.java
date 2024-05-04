package Vista;

import java.awt.Color;
import java.awt.Image;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.*;

public class VentanaOpcionesAdministrativo extends JFrame implements ActionListener, AdjustmentListener {

    // Creacion de elementos para la ventana
    private JPanel panelVentanaOpcionesAdministrativo = new JPanel();
    private JButton botonBuscar, botonEliminar, botonVolver, botonCerrarPrograma;
    private JTextArea AreaTextoPacientes;
    private JTextField CedulaSeleccionada_txt;
    private JLabel labelCedula;
    //private JScrollPane barraBar = new JScrollPane(AreaTextoPacientes);;

    public VentanaOpcionesAdministrativo() {

        // Ajustes para la ventana
        this.setTitle("Menú del Administrador");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);// Cambiar a Do nothing on close
        this.setLocationRelativeTo(null);
        this.setSize(600, 600);
        setLocationRelativeTo(null);
        this.getContentPane().add(panelVentanaOpcionesAdministrativo);
        panelVentanaOpcionesAdministrativo.setBackground(new Color(119, 176, 178));
        panelVentanaOpcionesAdministrativo.setLayout(null);
        Elementos();// llamada al metodo de elementos para agregar los elementos del panel a la
                    // interfaz grafica

    }

    public void Elementos() {

        // BOTONES
<<<<<<< HEAD
        botonBuscar = new JButton("Buscar");
        botonBuscar.setBounds(300, 50, 100, 30);
=======
        botonBuscar = new JButton("Seleccionar");
        botonBuscar.setBounds(300, 50, 120, 30);
>>>>>>> 31b4c972fd4621cf1b4bae8123f01ce8abf2175b
        botonBuscar.setForeground(new Color(27, 27, 30));

        /*
         * ImageIcon icono = new ImageIcon ("Vista/Imagenes/buscar.png");
         * int ancho = botonBuscar.getWidth();
         * int alto = botonBuscar.getHeight();
         * ImageIcon icon = new ImageIcon(icono.getImage().getScaledInstance(alto,
         * ancho, Image.SCALE_DEFAULT));
         * botonBuscar.setIcon(icono);
         */

        botonEliminar = new JButton("Eliminar");
        botonEliminar.setBounds(450, 50, 100, 30);
        botonEliminar.setForeground(new Color(27, 27, 30));

<<<<<<< HEAD
        botonMostrar = new JButton("Mostrar");
        botonMostrar.setBounds(270, 80, 100, 40);
        botonMostrar.setForeground(new Color(27, 27, 30));

=======
>>>>>>> 31b4c972fd4621cf1b4bae8123f01ce8abf2175b
        botonVolver = new JButton("Volver");
        botonVolver.setBounds(40, 500, 100, 40);
        botonVolver.setForeground(new Color(27, 27, 30));
        botonVolver.addActionListener(this);

        botonCerrarPrograma = new JButton("Salir del programa");
        botonCerrarPrograma.setBounds(400, 500, 150, 30);
        botonCerrarPrograma.setForeground(new Color(27, 27, 30));
        botonCerrarPrograma.addActionListener(this);

        // LABEL (Mensaje)
        labelCedula = new JLabel("Cedula: ");
        labelCedula.setBounds(20, 20, 100, 30);

        // TEXTO DE AREA
        AreaTextoPacientes = new JTextArea();
        AreaTextoPacientes.setBounds(50, 150, 500, 300);
        AreaTextoPacientes.setEditable(false);

        //ScrollPane
        

        // CAMPO DE TEXTO
        CedulaSeleccionada_txt = new JTextField();
        CedulaSeleccionada_txt.setEditable(true);
        CedulaSeleccionada_txt.setBounds(30, 50, 200, 30);

        // AGREGAR ELEMENTOS AL PANEL
        panelVentanaOpcionesAdministrativo.add(botonBuscar);
        panelVentanaOpcionesAdministrativo.add(botonEliminar);
        panelVentanaOpcionesAdministrativo.add(botonVolver);
        panelVentanaOpcionesAdministrativo.add(botonCerrarPrograma);
        panelVentanaOpcionesAdministrativo.add(AreaTextoPacientes);
        panelVentanaOpcionesAdministrativo.add(CedulaSeleccionada_txt);
        panelVentanaOpcionesAdministrativo.add(labelCedula);
     
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == botonVolver) {

            MenuPrimeraVista menuPrimeraVista = new MenuPrimeraVista();
            menuPrimeraVista.setVisible(true);
            this.dispose();

        }

        if (e.getSource() == botonCerrarPrograma) {

            this.dispose();

        }

        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        
        throw new UnsupportedOperationException("Unimplemented method 'adjustmentValueChanged'");
    }

}

package Vista;

import java.awt.Color;
import java.awt.Image;

import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaOpcionesAdministrativo extends JFrame {

    // Creacion de elementos para la ventana
    private JPanel panelVentanaOpcionesAdministrativo = new JPanel();
    private JButton botonBuscar, botonEliminar, botonMostrar, botonVolver, botonCerrarPrograma;
    private JLabel labelMensajeInformativo;

    public VentanaOpcionesAdministrativo() {

        this.setTitle("Menú del Administrador");
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(600, 600);
        this.getContentPane().add(panelVentanaOpcionesAdministrativo);
        panelVentanaOpcionesAdministrativo.setBackground(new Color(119, 176, 178));
        panelVentanaOpcionesAdministrativo.setLayout(null);
        Elementos();

    }

    public void Elementos() {

        // BOTONES
        botonBuscar = new JButton("Buscar");
        botonBuscar.setBounds(30, 50, 100, 100);
        botonBuscar.setForeground(new Color(27, 27, 30));
        ImageIcon icono = new ImageIcon ("Vista/Imagenes/buscar.png");
        int ancho = botonBuscar.getWidth();
        int alto = botonBuscar.getHeight();
        ImageIcon icon = new ImageIcon(icono.getImage().getScaledInstance(alto, ancho, Image.SCALE_DEFAULT));
        botonBuscar.setIcon(icono);


        botonEliminar = new JButton("Eliminar");
        botonEliminar.setBounds(130, 50, 100, 30);
        botonEliminar.setForeground(new Color(27, 27, 30));

        botonMostrar = new JButton("Mostrar");
        botonMostrar.setBounds(230, 50, 100, 30);
        botonMostrar.setForeground(new Color(27, 27, 30));

        botonVolver = new JButton("Volver");
        botonVolver.setBounds(40, 500, 150, 30);
        botonVolver.setForeground(new Color(27, 27, 30));

        botonCerrarPrograma = new JButton("Salir del programa");
        botonCerrarPrograma.setBounds(400, 500, 150, 30);
        botonCerrarPrograma.setForeground(new Color(27, 27, 30));

        /*
        // LABEL (Mensaje)
        labelMensajeInformativo = new JLabel("Seleccione una opción");
        labelMensajeInformativo.setBounds(100, 50, 300, 40);
         */

        // AGREGAR ELEMENTOS AL PANEL
        panelVentanaOpcionesAdministrativo.add(botonBuscar);
        panelVentanaOpcionesAdministrativo.add(botonEliminar);
        panelVentanaOpcionesAdministrativo.add(botonMostrar);
        panelVentanaOpcionesAdministrativo.add(botonVolver);
        panelVentanaOpcionesAdministrativo.add(botonCerrarPrograma);
        //panelVentanaOpcionesAdministrativo.add(labelMensajeInformativo);

    }

}

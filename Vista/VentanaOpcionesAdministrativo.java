package Vista;

import java.awt.Color;
import java.awt.Image;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class VentanaOpcionesAdministrativo extends JFrame implements ActionListener, AdjustmentListener {

    // Creacion de elementos para la ventanas
    private JPanel panelVentanaOpcionesAdministrativo = new JPanel();
    private JButton botonEditar, botonEliminar, botonVolver, botonCerrarPrograma;
    private JTextField CedulaSeleccionada_txt;
    private JLabel labelCedula;
    private String[] cabecera = { "Nombre", "Cédula", "Edad", "Sexo", "Transtorno" };
    private String[][] datos = {

            { "Aaron", "111", "19", "Macho pecho peludo", "Depreson" },
            { "Aaron", "111", "19", "Macho pecho peludo", "Depreson" },
            { "Aaron", "111", "19", "Macho pecho peludo", "Depreson" },
            { "Aaron", "111", "19", "Macho pecho peludo", "Depreson" },
            { "Aaron", "111", "19", "Macho pecho peludo", "Depreson" },
            { "Aaron", "111", "19", "Macho pecho peludo", "Depreson" },
            { "Aaron", "111", "19", "Macho pecho peludo", "Depreson" },
            { "Aaron", "111", "19", "Macho pecho peludo", "Depreson" },
            { "Aaron", "111", "19", "Macho pecho peludo", "Depreson" },
            { "Aaron", "111", "19", "Macho pecho peludo", "Depreson" },
            { "Aaron", "111", "19", "Macho pecho peludo", "Depreson" },
            { "Aaron", "111", "19", "Macho pecho peludo", "Depreson" },
            { "Aaron", "111", "19", "Macho pecho peludo", "Depreson" },
            { "Aaron", "111", "19", "Macho pecho peludo", "Depreson" },

    };
    DefaultTableModel modeloTabla = new DefaultTableModel(cabecera, 5) {

        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    JTable tabla = new JTable(modeloTabla);
    JScrollPane scroll = new JScrollPane(tabla);

    public VentanaOpcionesAdministrativo() {

        // Ajustes para la ventana
        this.setTitle("Menú del Administrador");
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(800, 800);
        setLocationRelativeTo(null);
        this.getContentPane().add(panelVentanaOpcionesAdministrativo);
        panelVentanaOpcionesAdministrativo.setBackground(new Color(119, 176, 178));
        panelVentanaOpcionesAdministrativo.setLayout(null);
        Elementos();// llamada al metodo de elementos para agregar los elementos del panel a la
                    // interfaz grafica

    }

    public void Elementos() {

        // BOTONES
        botonEditar = new JButton("Editar Paciente");
        botonEditar.setBounds(40, 120, 150, 20);
        botonEditar.setForeground(new Color(27, 27, 30));
        botonEditar.addActionListener(this);

        botonEliminar = new JButton("Eliminar Paciente");
        botonEliminar.setBounds(200, 120, 150, 20);
        botonEliminar.setForeground(new Color(27, 27, 30));
        botonEliminar.addActionListener(this);

        /*
         * ImageIcon icono = new ImageIcon ("Vista/Imagenes/buscar.png");
         * int ancho = botonBuscar.getWidth();
         * int alto = botonBuscar.getHeight();
         * ImageIcon icon = new ImageIcon(icono.getImage().getScaledInstance(alto,
         * ancho, Image.SCALE_DEFAULT));
         * botonBuscar.setIcon(icono);
         */

        botonVolver = new JButton("Volver");
        botonVolver.setBounds(40, 700, 100, 20);
        botonVolver.setForeground(new Color(27, 27, 30));
        botonVolver.addActionListener(this);

        botonCerrarPrograma = new JButton("Salir del programa");
        botonCerrarPrograma.setBounds(600, 700, 150, 20);
        botonCerrarPrograma.setForeground(new Color(27, 27, 30));
        botonCerrarPrograma.addActionListener(this);

        // LABEL (Mensaje)
        labelCedula = new JLabel("Digite la cédula del paciente a manipular: ");
        labelCedula.setBounds(40, 50, 300, 30);

        // CAMPO DE TEXTO
        CedulaSeleccionada_txt = new JTextField();
        CedulaSeleccionada_txt.setEditable(true);
        CedulaSeleccionada_txt.setBounds(300, 55, 200, 20);

        // JSCROLLPANE
        scroll.setBounds(40, 180, 700, 500);

        // AGREGAR ELEMENTOS AL PANEL
        panelVentanaOpcionesAdministrativo.add(botonEditar);
        panelVentanaOpcionesAdministrativo.add(botonVolver);
        panelVentanaOpcionesAdministrativo.add(botonEliminar);
        panelVentanaOpcionesAdministrativo.add(botonCerrarPrograma);
        panelVentanaOpcionesAdministrativo.add(CedulaSeleccionada_txt);
        panelVentanaOpcionesAdministrativo.add(labelCedula);
        panelVentanaOpcionesAdministrativo.add(scroll);

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

        if(e.getSource()== botonEditar){

            EditarPaciente editarPaciente = new EditarPaciente();
            editarPaciente.setVisible(true);
            this.dispose();

        }

        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {

        throw new UnsupportedOperationException("Unimplemented method 'adjustmentValueChanged'");
    }

}

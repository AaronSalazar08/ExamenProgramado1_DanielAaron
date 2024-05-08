package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import Controlador.Principal;
import Modelo.Paciente;

public class VentanaOpcionesAdministrativo extends JFrame implements ActionListener {

    // Creacion de elementos para la ventanas
    private JPanel panelVentanaOpcionesAdministrativo = new JPanel();
    private JButton botonEliminar, botonVolver;
    private String[] cabecera = { "Nombre", "Cédula", "Edad", "Sexo", "Transtorno" };

    DefaultTableModel modeloTabla = new DefaultTableModel(cabecera, 5) {

        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    JTable tablaPacientes = new JTable(modeloTabla);
    JScrollPane scroll = new JScrollPane(tablaPacientes);

    Font fuente = new Font("Century Schoolbook", Font.PLAIN, 20);

    public VentanaOpcionesAdministrativo() {

        // Ajustes para la ventana
        this.setTitle("Menú del Administrador");
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(800, 600);
        setLocationRelativeTo(null);
        this.getContentPane().add(panelVentanaOpcionesAdministrativo);
        panelVentanaOpcionesAdministrativo.setBackground(new Color(119, 176, 178));
        panelVentanaOpcionesAdministrativo.setLayout(null);
        Elementos();// llamada al metodo de elementos para agregar los elementos del panel a la
                    // interfaz grafica

    }

    public void Elementos() {

        // JButton
        botonEliminar = new JButton();
        botonEliminar.setBounds(600, 450, 50, 50);
        botonEliminar.setForeground(new Color(27, 27, 30));
        botonEliminar.addActionListener(this);
        ImageIcon iconoEliminar = new ImageIcon("Vista/Imagenes/EliminarBoton (1).png");
        if (iconoEliminar != null && iconoEliminar.getImage() != null) {
            Image imagenEliminarAjustada = iconoEliminar.getImage().getScaledInstance(70, 50, Image.SCALE_SMOOTH);
            botonEliminar.setIcon(new ImageIcon(imagenEliminarAjustada));
        }

        botonVolver = new JButton();
        botonVolver.setBounds(40, 500, 65, 30);
        botonVolver.setBackground(new Color(119, 176, 178));
        botonVolver.addActionListener(this);
        ImageIcon iconoVolver = new ImageIcon("Vista/Imagenes/volver2.png");
        if (iconoVolver != null && iconoVolver.getImage() != null) {
            Image imagenVolverAjustada = iconoVolver.getImage().getScaledInstance(55, 40, Image.SCALE_SMOOTH);
            botonVolver.setIcon(new ImageIcon(imagenVolverAjustada));
        }

        // JSCROLLPANE
        scroll.setBounds(40, 30, 700, 370);

        // AGREGAR ELEMENTOS AL PANEL

        panelVentanaOpcionesAdministrativo.add(botonVolver);
        panelVentanaOpcionesAdministrativo.add(botonEliminar);
        panelVentanaOpcionesAdministrativo.add(scroll);

        for (int contador = 0; contador < Principal.listaPacientes.size(); contador++) {

            Paciente paciente = Principal.listaPacientes.get(contador);
            tablaPacientes.setValueAt(paciente.getNombre(), contador, 0);
            tablaPacientes.setValueAt(paciente.getCedula(), contador, 1);
            tablaPacientes.setValueAt(paciente.getEdad(), contador, 2);
            tablaPacientes.setValueAt(paciente.getSexo(), contador, 3);
            tablaPacientes.setValueAt(paciente.getTranstorno(), contador, 4);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == botonVolver) {

            MenuPrimeraVista menuPrimeraVista = new MenuPrimeraVista();
            menuPrimeraVista.setVisible(true);
            this.dispose();

        }

        
         
          if (e.getSource() == botonEliminar) {

            int filaSeleccionada = tablaPacientes.getSelectedRow();

            if (filaSeleccionada != -1) {

                int confirmacion = JOptionPane.showConfirmDialog(null,
                        "¿Estás seguro de que quieres eliminar este paciente? ",
                        "Confirmar",
                        JOptionPane.YES_NO_OPTION);

                if (confirmacion == JOptionPane.YES_OPTION) {

                    Principal.listaPacientes.remove(filaSeleccionada);

                    modeloTabla.removeRow(filaSeleccionada);
                }

            }

        }
         
       

    }

}

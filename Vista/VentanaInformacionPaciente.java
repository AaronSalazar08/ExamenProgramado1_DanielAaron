package Vista;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Image;

public class VentanaInformacionPaciente extends JFrame implements ActionListener {

    public JPanel panelInfoPaciente = new JPanel();
    public JButton botonRegistrar, botonCancelar;
    public JLabel labelNombrePaciente, labelCedula, labelEdad, labelTranstorno, labelSexo, labelTitulo;
    public static JTextField nombrePacienteTxt;
    public static JTextField cedulaPacienteTxt;
    public static JTextField EdadPacienteTxt;
    public static JComboBox comboTranstorno;
    public static JRadioButton botonMasculino, botonFemenino;
    Font fuenteBoton = new Font("Century Schoolbook", Font.PLAIN, 20);

    public VentanaInformacionPaciente() {
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setTitle("Registro de Paciente");
        this.setLocationRelativeTo(null);
        this.setSize(385, 560);
        this.setContentPane(panelInfoPaciente);
        panelInfoPaciente.setBackground(new Color(209, 242, 235));
        setLocationRelativeTo(null);
        panelInfoPaciente.setLayout(null);

        Elementos();

    }

    public void Elementos() {
        // Añadir elementos al panel

        // JButton

        botonRegistrar = new JButton("Registrar");
        botonRegistrar.setBounds(225, 465, 150, 30);
        botonRegistrar.setForeground(Color.BLACK);
        botonRegistrar.setBackground(new Color(31, 209, 185));
        botonRegistrar.setFont(fuenteBoton);

        botonRegistrar.addActionListener(this);
        botonRegistrar.setOpaque(false);
        botonRegistrar.setContentAreaFilled(false);
        botonRegistrar.setBorderPainted(false);

        botonCancelar = new JButton();
        botonCancelar.setBounds(20, 465, 55, 30);
        botonCancelar.setForeground(Color.BLACK);
        botonCancelar.setBackground(new Color(31, 209, 185));
        botonCancelar.addActionListener(this);
        botonCancelar.setOpaque(false);
        botonCancelar.setContentAreaFilled(false);
        botonCancelar.setBorderPainted(false);
        ImageIcon iconoVolver = new ImageIcon("Vista/Imagenes/volver4.png");
        if (iconoVolver != null && iconoVolver.getImage() != null) {
            Image imagenVolverAjustada = iconoVolver.getImage().getScaledInstance(55, 40, Image.SCALE_SMOOTH);
            botonCancelar.setIcon(new ImageIcon(imagenVolverAjustada));
        }

        // JLabel

        labelNombrePaciente = new JLabel("Nombre:");
        labelNombrePaciente.setBounds(20, 115, 350, 50);
        Font fuente1 = new Font("Century Schoolbook", Font.PLAIN, 18);
        labelNombrePaciente.setFont(fuente1);
        labelNombrePaciente.setForeground(new Color(23, 32, 42));

        labelCedula = new JLabel("Cédula:");
        labelCedula.setBounds(20, 40, 400, 70);
        Font fuente2 = new Font("Century Schoolbook", Font.PLAIN, 18);
        labelCedula.setFont(fuente2);
        labelCedula.setForeground(new Color(23, 32, 42));

        labelEdad = new JLabel("Edad:");
        labelEdad.setBounds(20, 170, 400, 70);
        Font fuente3 = new Font("Century Schoolbook", Font.PLAIN, 18);
        labelEdad.setFont(fuente3);
        labelEdad.setForeground(new Color(23, 32, 42));

        labelTranstorno = new JLabel("Tipo de transtorno:");
        labelTranstorno.setBounds(20, 310, 400, 70);
        Font fuente4 = new Font("Century Schoolbook", Font.PLAIN, 18);
        labelTranstorno.setFont(fuente4);
        labelTranstorno.setForeground(new Color(23, 32, 42));

        labelSexo = new JLabel("Sexo:");
        labelSexo.setBounds(20, 240, 400, 70);
        Font fuente5 = new Font("Century Schoolbook", Font.PLAIN, 18);
        labelSexo.setFont(fuente5);
        labelSexo.setForeground(new Color(23, 32, 42));

        // JTexfield

        nombrePacienteTxt = new JTextField(" ");
        nombrePacienteTxt.setBounds(185, 130, 130, 20);

        cedulaPacienteTxt = new JTextField(" ");
        cedulaPacienteTxt.setBounds(185, 65, 150, 20);

        EdadPacienteTxt = new JTextField(" ");
        EdadPacienteTxt.setBounds(190, 195, 30, 20);

        // JComboBox

        comboTranstorno = new JComboBox();
        comboTranstorno.setBounds(195, 330, 125, 45);
        comboTranstorno.addItem("Depresión");
        comboTranstorno.addItem("Transtorno Obsesivo Compulsivo");
        comboTranstorno.addItem("Ansiedad");
        comboTranstorno.addItem("Deficit atencional");

        // JRadioButton

        botonMasculino = new JRadioButton("Masculino");
        botonMasculino.setBounds(195, 240, 95, 35);

        botonFemenino = new JRadioButton("Femenino");
        botonFemenino.setBounds(195, 270, 95, 35);

        ButtonGroup grupoBotones = new ButtonGroup();
        grupoBotones.add(botonMasculino);
        grupoBotones.add(botonFemenino);

        // añadir elementos al panel
        panelInfoPaciente.add(EdadPacienteTxt);
        panelInfoPaciente.add(cedulaPacienteTxt);
        panelInfoPaciente.add(nombrePacienteTxt);

        panelInfoPaciente.add(labelTranstorno);
        panelInfoPaciente.add(labelSexo);
        panelInfoPaciente.add(labelNombrePaciente);
        panelInfoPaciente.add(labelEdad);
        panelInfoPaciente.add(labelCedula);

        panelInfoPaciente.add(botonRegistrar);
        panelInfoPaciente.add(botonCancelar);

        panelInfoPaciente.add(comboTranstorno);

        panelInfoPaciente.add(botonMasculino);
        panelInfoPaciente.add(botonFemenino);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == botonCancelar) {
            JOptionPane.showMessageDialog(null, "Regresando al menú principal");
            MenuPrimeraVista instanciaInicio = new MenuPrimeraVista();
            instanciaInicio.setVisible(true);
            this.dispose();

        }


        

        if (e.getSource() == botonRegistrar) {

            String entradaNombrePaciente = nombrePacienteTxt.getText().trim();
            String entradaCedulaPaciente = cedulaPacienteTxt.getText().trim();
            String entradaEdadPaciente = EdadPacienteTxt.getText().trim();
            String transtornoSeleccionado = (String) comboTranstorno.getSelectedItem();
            boolean masculinoSeleccionado = botonMasculino.isSelected();
            boolean femeninoSeleccionado = botonFemenino.isSelected();

            if (entradaNombrePaciente.isEmpty() || entradaEdadPaciente.isEmpty() || entradaCedulaPaciente.isEmpty()) {

                JOptionPane.showMessageDialog(null, "Verifique que los campos a rellenar no estén vacíos");

            } else if (!entradaNombrePaciente.isEmpty() && !entradaEdadPaciente.isEmpty()
                    && !entradaCedulaPaciente.isEmpty()) {

                int edadPaciente;
                try {

                    edadPaciente = Integer.parseInt(entradaEdadPaciente);

                    if (!botonMasculino.isSelected() && !botonFemenino.isSelected()) {

                        JOptionPane.showMessageDialog(null, "Por favor, seleccione el sexo del paciente.");
                        return;
                    }

                    

                    if (botonMasculino.isSelected()) {

                        String sexoMasculino = botonMasculino.isSelected() ? "Masculino" : "Masculino";

                        Controlador.Metodos.RegistrarPacientes(entradaNombrePaciente, entradaCedulaPaciente,
                                transtornoSeleccionado, sexoMasculino, edadPaciente);

                        JOptionPane.showMessageDialog(null, "Registrado exitosamente \n Mostrando Resultados");

                        MenuPrimeraVista menuPrimeraVista = new MenuPrimeraVista();
                        menuPrimeraVista.setVisible(true);
                        this.dispose();

                    }

                    else if (botonFemenino.isSelected()) {

                        String sexoFemenino = botonMasculino.isSelected() ? "Femenino" : "Femenino";
                        Controlador.Metodos.RegistrarPacientes(entradaNombrePaciente, entradaCedulaPaciente,
                                transtornoSeleccionado, sexoFemenino, edadPaciente);

                        JOptionPane.showMessageDialog(null, "Registrado exitosamente \n Mostrando Resultados");

                        MenuPrimeraVista menuPrimeraVista = new MenuPrimeraVista();
                        menuPrimeraVista.setVisible(true);
                        this.dispose();
                    }
                } catch (NumberFormatException ex) {

                    JOptionPane.showMessageDialog(null, "Debe ingresar un valor valido para la edad");
                }
            } // fin del else if si todas las entradas de texto no estan vacios

        } // Fin boton registrar

    }// Fin action listener
}// Fin Clase principal

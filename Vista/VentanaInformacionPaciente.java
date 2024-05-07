package Vista;

import javax.swing.ButtonGroup;
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

public class VentanaInformacionPaciente extends JFrame implements ActionListener {

    public JPanel panelInfoPaciente = new JPanel();
    public JButton botonRegistrar, botonCancelar;
    public JLabel labelNombrePaciente, labelCedula, labelEdad, labelTranstorno, labelSexo, labelTitulo;
    public JTextField nombrePacienteTxt;
    public JTextField cedulaPacienteTxt;
    public JTextField EdadPacienteTxt;
    public JComboBox comboTranstorno;
    public JRadioButton botonMasculino, botonFemenino;

    public VentanaInformacionPaciente() {
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(800, 800);
        this.setContentPane(panelInfoPaciente);
        panelInfoPaciente.setBackground(new Color(119, 176, 178));
        setLocationRelativeTo(null);
        panelInfoPaciente.setLayout(null);

        Elementos();

    }

    public void Elementos() {
        // Añadir elementos al panel

        // JButton

        botonRegistrar = new JButton("Registrar");
        botonRegistrar.setBounds(570, 600, 200, 30);
        botonRegistrar.setForeground(Color.BLACK);
        botonRegistrar.addActionListener(this);

        botonCancelar = new JButton("Cancelar");
        botonCancelar.setBounds(10, 600, 200, 30);
        botonCancelar.setForeground(Color.BLACK);
        botonCancelar.addActionListener(this);

        // JLabel

        labelNombrePaciente = new JLabel("Introduzca el nombre del paciente");
        labelNombrePaciente.setBounds(20, 40, 400, 70);
        Font fuente1 = new Font("Century Schoolbook", Font.PLAIN, 16);
        labelNombrePaciente.setFont(fuente1);
        labelNombrePaciente.setForeground(new Color(81, 33, 176));

        labelCedula = new JLabel("Introduzca la cédula del paciente");
        labelCedula.setBounds(20, 150, 400, 70);
        Font fuente2 = new Font("Century Schoolbook", Font.PLAIN, 16);
        labelCedula.setFont(fuente2);
        labelCedula.setForeground(new Color(81, 33, 176));

        labelEdad = new JLabel("Introduzca la edad del paciente");
        labelEdad.setBounds(20, 260, 400, 70);
        Font fuente3 = new Font("Century Schoolbook", Font.PLAIN, 16);
        labelEdad.setFont(fuente3);
        labelEdad.setForeground(new Color(81, 33, 176));

        labelTranstorno = new JLabel("Seleccione el transtorno a padecer por el paciente");
        labelTranstorno.setBounds(390, 210, 400, 70);
        Font fuente4 = new Font("Century Schoolbook", Font.PLAIN, 16);
        labelTranstorno.setFont(fuente4);
        labelTranstorno.setForeground(new Color(81, 33, 176));

        labelSexo = new JLabel("Introduzca el sexo del paciente");
        labelSexo.setBounds(450, 40, 400, 70);
        Font fuente5 = new Font("Century Schoolbook", Font.PLAIN, 16);
        labelSexo.setFont(fuente5);
        labelSexo.setForeground(new Color(81, 33, 176));

        // JTexfield

        nombrePacienteTxt = new JTextField();
        nombrePacienteTxt.setBounds(40, 100, 200, 30);

        cedulaPacienteTxt = new JTextField();
        cedulaPacienteTxt.setBounds(40, 210, 200, 30);

        EdadPacienteTxt = new JTextField();
        EdadPacienteTxt.setBounds(40, 320, 200, 30);

        // JComboBox

        comboTranstorno = new JComboBox();
        comboTranstorno.setBounds(515, 290, 125, 45);
        comboTranstorno.addItem("Depresión");
        comboTranstorno.addItem("Transtorno Obsesivo Compulsivo");
        comboTranstorno.addItem("Ansiedad");
        comboTranstorno.addItem("Deficit atencional");

        // JButton

        botonMasculino = new JRadioButton("Masculino");
        botonMasculino.setBounds(520, 100, 95, 35);

        botonFemenino = new JRadioButton("Femenino");
        botonFemenino.setBounds(520, 130, 95, 35);

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


                        ResultadosPaciente resultados = new ResultadosPaciente();
                        resultados.setVisible(true);
                        this.dispose();

                    }

                    else if (botonFemenino.isSelected()) {

                        String sexoFemenino = botonMasculino.isSelected() ? "Femenino" : "Femenino";
                        Controlador.Metodos.RegistrarPacientes(entradaNombrePaciente, entradaCedulaPaciente,
                                transtornoSeleccionado, sexoFemenino, edadPaciente);
                       
                        JOptionPane.showMessageDialog(null, "Registrado exitosamente \n Mostrando Resultados");

                        ResultadosPaciente resultados = new ResultadosPaciente();
                        resultados.setVisible(true);
                        this.dispose();
                    }
                } catch (NumberFormatException ex) {

                    JOptionPane.showMessageDialog(null, "Debe ingresar un valor valido para la edad");
                }
            } // fin del else if si todas las entradas de texto no estan vacios

        } // Fin boton registrar

    }// Fin action listener
}// Fin Clase principal

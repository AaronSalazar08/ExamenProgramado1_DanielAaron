package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class EditarPaciente extends JFrame implements ActionListener {

    JPanel panelEditarPaciente = new JPanel();
    JTextField nombrePacienteTxt, cedulaPacienteTxt, EdadPacienteTxt;
    JComboBox comboTranstorno;
    JRadioButton botonMasculino, botonFemenino;
    JLabel labelNombrePaciente, labelCedula, labelEdad, labelTranstorno, labelSexo, labelTitulo;
    JButton botonVolver, botonAceptar;

    public EditarPaciente (){

        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(400, 400);
        this.setContentPane(panelEditarPaciente);
        panelEditarPaciente.setBackground(new Color(209, 242, 235));
        setLocationRelativeTo(null);
        panelEditarPaciente.setLayout(null);

        Elementos();

    }

    public void Elementos (){

        //JLabel
        labelNombrePaciente = new JLabel ("Nombre: ");
        labelNombrePaciente.setBounds(20, 40, 350, 50);
        Font fuente1 = new Font("Century Schoolbook", Font.PLAIN, 18);
        labelNombrePaciente.setFont(fuente1);
        labelNombrePaciente.setForeground(new Color(23, 32, 42));

        labelCedula = new JLabel("Cédula:");
        labelCedula.setBounds(20, 5, 400, 50);
        Font fuente2 = new Font("Century Schoolbook", Font.PLAIN, 18);
        labelCedula.setFont(fuente2);
        labelCedula.setForeground(new Color(23, 32, 42));

        labelEdad = new JLabel("Edad:");
        labelEdad.setBounds(20, 80, 400, 50);
        Font fuente3 = new Font("Century Schoolbook", Font.PLAIN, 18);
        labelEdad.setFont(fuente3);
        labelEdad.setForeground(new Color(23, 32, 42));

        labelTranstorno = new JLabel("Tipo de transtorno:");
        labelTranstorno.setBounds(20, 170, 400, 50);
        Font fuente4 = new Font("Century Schoolbook", Font.PLAIN, 18);
        labelTranstorno.setFont(fuente4);
        labelTranstorno.setForeground(new Color(23, 32, 42));

        labelSexo = new JLabel("Sexo:");
        labelSexo.setBounds(20, 110, 200, 70);
        Font fuente5 = new Font("Century Schoolbook", Font.PLAIN, 18);
        labelSexo.setFont(fuente5);
        labelSexo.setForeground(new Color(23, 32, 42));

        //JTextField
        nombrePacienteTxt = new JTextField(" ");
        nombrePacienteTxt.setBounds(120, 55, 130, 20);

        cedulaPacienteTxt = new JTextField(" ");
        cedulaPacienteTxt.setBounds(120, 20, 150, 20);

        EdadPacienteTxt = new JTextField(" ");
        EdadPacienteTxt.setBounds(120, 95, 30, 20);

        //JComboBox
        comboTranstorno = new JComboBox();
        comboTranstorno.setBounds(200, 180, 125, 30);
        comboTranstorno.addItem("Depresión");
        comboTranstorno.addItem("Transtorno Obsesivo Compulsivo");
        comboTranstorno.addItem("Ansiedad");
        comboTranstorno.addItem("Deficit atencional");
       


         // JRadioButton

        botonMasculino = new JRadioButton("Masculino");
        botonMasculino.setBounds(120, 130, 95, 35);
        botonMasculino.setBackground(new Color(209, 242, 235));

        botonFemenino = new JRadioButton("Femenino");
        botonFemenino.setBounds(220, 130, 95, 35);
        botonFemenino.setBackground(new Color(209, 242, 235));

        ButtonGroup grupoBotones = new ButtonGroup();
        grupoBotones.add(botonMasculino);
        grupoBotones.add(botonFemenino);

        //JButton
        botonVolver = new JButton();
        botonVolver.setBounds(10, 300, 65, 30);
        botonVolver.setBackground(new Color(209, 242, 235));
        botonVolver.addActionListener(this);
        botonVolver.setOpaque(false);
        botonVolver.setContentAreaFilled(false);
        botonVolver.setBorderPainted(false);
        ImageIcon iconoVolver = new ImageIcon("Vista/Imagenes/volver4.png");
        if (iconoVolver != null && iconoVolver.getImage() != null) {
            Image imagenVolverAjustada = iconoVolver.getImage().getScaledInstance(55, 40, Image.SCALE_SMOOTH);
            botonVolver.setIcon(new ImageIcon(imagenVolverAjustada));
        }


        botonAceptar = new JButton();
        botonAceptar.setBounds(150, 250, 85, 40);
        botonAceptar.setBackground(new Color(209, 242, 235));
        botonAceptar.addActionListener(this);
        botonAceptar.setOpaque(false);
        botonAceptar.setContentAreaFilled(false);
        botonAceptar.setBorderPainted(false);
        ImageIcon iconoAceptar = new ImageIcon("Vista/Imagenes/Aceptar.png");
        if (iconoAceptar != null && iconoAceptar.getImage() != null) {
            Image imagenAceptarAjustada = iconoAceptar.getImage().getScaledInstance(75, 50, Image.SCALE_SMOOTH);
            botonAceptar.setIcon(new ImageIcon(imagenAceptarAjustada));
        }

        // añadir elementos al panel
        panelEditarPaciente.add(EdadPacienteTxt);
        panelEditarPaciente.add(cedulaPacienteTxt);
        panelEditarPaciente.add(nombrePacienteTxt);

        panelEditarPaciente.add(labelTranstorno);
        panelEditarPaciente.add(labelSexo);
        panelEditarPaciente.add(labelNombrePaciente);
        panelEditarPaciente.add(labelEdad);
        panelEditarPaciente.add(labelCedula);

        panelEditarPaciente.add(comboTranstorno);
        panelEditarPaciente.add(botonMasculino);
        panelEditarPaciente.add(botonFemenino);

        panelEditarPaciente.add(botonVolver);
        panelEditarPaciente.add(botonAceptar);



    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == botonVolver){

            VentanaOpcionesAdministrativo ventanaOpcionesAdministrativo = new VentanaOpcionesAdministrativo();
            ventanaOpcionesAdministrativo.setVisible(true);
            this.dispose();
        }

        if(e.getSource() == botonAceptar){

            
        }
    
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

}

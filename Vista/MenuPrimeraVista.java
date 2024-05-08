package Vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrimeraVista extends JFrame implements ActionListener {

    public JPanel panelPrimeraVista = new JPanel();
    public JButton botonAdministrativo, botonPaciente, botonSalir, botonExpendiente;
    public JLabel fraseLabel, tituloLabel, labelDescripcion;

    public MenuPrimeraVista() {
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(600, 550);
        this.setContentPane(panelPrimeraVista);
        panelPrimeraVista.setBackground(new Color(31, 209, 185));
        setLocationRelativeTo(null);
        panelPrimeraVista.setLayout(null);

        Elementos();
    }

    public void Elementos() {
        // Creación de Elementos

        // JLabel
        tituloLabel = new JLabel("Centro de Apoyo Solís Salazar");
        tituloLabel.setBounds(110, 20, 400, 70);
        Font fuente1 = new Font("Century Schoolbook", Font.PLAIN, 26); //
        tituloLabel.setFont(fuente1);
        tituloLabel.setForeground(new Color(235, 35, 95));

        labelDescripcion = new JLabel("Centro de apoyo para niños con transtornos mentales en Costa Rica");
        labelDescripcion.setBounds(35, 70, 590, 70);
        Font fuente4 = new Font("Century Schoolbook", Font.PLAIN, 16); //
        labelDescripcion.setFont(fuente4);
        labelDescripcion.setForeground(new Color(255, 255, 204));

        fraseLabel = new JLabel("El ayudar es don que todos tenemos");
        fraseLabel.setBounds(155, 120, 600, 70);
        Font fuente2 = new Font("Century Schoolbook", Font.PLAIN, 16); //
        fraseLabel.setFont(fuente2);
        fraseLabel.setForeground(new Color(81, 33, 176));

        // JButton
        botonAdministrativo = new JButton("Administrativo");
        botonAdministrativo.setBounds(185, 330, 200, 30);
        botonAdministrativo.setForeground(Color.BLACK);
        botonAdministrativo.addActionListener(this);
        botonAdministrativo.setBackground(new Color(255, 255, 102));
        botonAdministrativo.setBorderPainted(false);

        botonPaciente = new JButton("Registrar Paciente");
        botonPaciente.setBounds(185, 220, 200, 30);
        botonPaciente.setForeground(Color.BLACK);
        botonPaciente.addActionListener(this);
        botonPaciente.setBackground(new Color(255, 255, 102));
        botonPaciente.setBorderPainted(false);

        botonExpendiente = new JButton("Expendiente Medico");
        botonExpendiente.setBounds(185, 275, 200, 30);
        botonExpendiente.setForeground(Color.BLACK);
        botonExpendiente.addActionListener(this);
        botonExpendiente.setBackground(new Color(255, 255, 102));
        botonExpendiente.setBorderPainted(false);

        botonSalir = new JButton("Salir del programa");
        botonSalir.setBounds(185, 385, 200, 30);
        botonSalir.setForeground(Color.BLACK);
        botonSalir.addActionListener(this);
        botonSalir.setBackground(new Color(255, 255, 102));
        botonSalir.setBorderPainted(false);

        // Agregar elementos al panel
        panelPrimeraVista.add(tituloLabel);
        panelPrimeraVista.add(fraseLabel);
        panelPrimeraVista.add(botonAdministrativo);
        panelPrimeraVista.add(botonPaciente);
        panelPrimeraVista.add(labelDescripcion);
        panelPrimeraVista.add(botonExpendiente);
        panelPrimeraVista.add(botonSalir);

    }

    public void actionPerformed(ActionEvent e) {
        String opcion;

        // Ciclo if en caso de que se seleccione la opcion "Administrativo"
        if (e.getSource() == botonAdministrativo) {
            JOptionPane.showMessageDialog(null, "Acción de inicio de sesión");
            LoginAdmin loginAdmin = new LoginAdmin();
            loginAdmin.setVisible(true);
            this.dispose();

            // Ciclo if en caso de que se seleccione la opcion "Paciente"

        } else if (e.getSource() == botonPaciente) {
            JOptionPane.showMessageDialog(null, "Interfaz Paciente seleccionada");
            VentanaInformacionPaciente instanciaPaciente = new VentanaInformacionPaciente();
            instanciaPaciente.setVisible(true);
            this.dispose();

        } else if (e.getSource() == botonSalir) {

            int confirmacion = JOptionPane.showConfirmDialog(null,
                    "¿Estás seguro de que quieres salir del programa? ",
                    "Confirmar",
                    JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {

                this.dispose();
            }

        }

        

    }

}

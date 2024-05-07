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
    public JButton botonAdministrativo, botonPaciente;
    public JLabel fraseLabel, indicacionesLabel, tituloLabel, labelDescripcion ;

    public MenuPrimeraVista() {
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(800, 800);
        this.setContentPane(panelPrimeraVista);
        panelPrimeraVista.setBackground(new Color(119, 176, 178));
        setLocationRelativeTo(null);
        panelPrimeraVista.setLayout(null);

        Elementos();
    }

    public void Elementos() {
        // Creación de Elementos

        // JLabel
        tituloLabel = new JLabel("Centro de Apoyo Solís Salazar");
        tituloLabel.setBounds(220, 20, 400, 70);
        Font fuente1 = new Font("Century Schoolbook", Font.PLAIN, 26); //
        tituloLabel.setFont(fuente1);
        tituloLabel.setForeground(new Color(81, 33, 176));

        labelDescripcion = new JLabel("Centro de apoyo para niños con transtornos mentales en Costa Rica");
        labelDescripcion.setBounds(130, 70, 590, 70);
        Font fuente4 = new Font("Century Schoolbook", Font.PLAIN, 18); //
        labelDescripcion.setFont(fuente4);
        labelDescripcion.setForeground(new Color(81, 33, 176));


        fraseLabel = new JLabel("El ayudar es don que todos tenemos");
        fraseLabel.setBounds(250, 120, 600, 70);
        Font fuente2 = new Font("Century Schoolbook", Font.PLAIN, 18); //
        fraseLabel.setFont(fuente2);
        fraseLabel.setForeground(new Color(81, 33, 176));

        indicacionesLabel = new JLabel("Por favor indique el tipo de usuario a atender");
        indicacionesLabel.setBounds(230, 340, 600, 70);
        Font fuente3 = new Font("Century Schoolbook", Font.PLAIN, 16); //
        indicacionesLabel.setFont(fuente3);
        indicacionesLabel.setForeground(new Color(81, 33, 176));

        // JButton
        botonAdministrativo = new JButton("Administrativo");
        botonAdministrativo.setBounds(180, 410, 200, 30);
        botonAdministrativo.setForeground(Color.BLACK);
        botonAdministrativo.addActionListener(this);

        botonPaciente = new JButton("Paciente");
        botonPaciente.setBounds(420, 410, 200, 30);
        botonPaciente.setForeground(Color.BLACK);
        botonPaciente.addActionListener(this);

        // Agregar elementos al panel
        panelPrimeraVista.add(tituloLabel);
        panelPrimeraVista.add(fraseLabel);
        panelPrimeraVista.add(indicacionesLabel);
        panelPrimeraVista.add(botonAdministrativo);
        panelPrimeraVista.add(botonPaciente);
        panelPrimeraVista.add(labelDescripcion);

    }

    public void actionPerformed(ActionEvent e) {

        // Ciclo if en caso de que se seleccione la opcion "Administrativo"
        if (e.getSource() == botonAdministrativo) {
            JOptionPane.showMessageDialog(null, "Acción de inicio de sesión");
            LoginAdmin inicioSesion =  new LoginAdmin ();
            inicioSesion.setVisible(true);
            this.dispose();
            
            // Ciclo if en caso de que se seleccione la opcion "Paciente"

        } else if (e.getSource() == botonPaciente) {
            JOptionPane.showMessageDialog(null, "Interfaz Paciente seleccionada");
            VentanaInformacionPaciente instanciaPaciente = new VentanaInformacionPaciente();
            instanciaPaciente.setVisible(true);
            this.dispose();

        }

    }

}

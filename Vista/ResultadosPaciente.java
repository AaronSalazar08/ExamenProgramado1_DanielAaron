package Vista;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResultadosPaciente extends JFrame implements ActionListener {

    public JPanel panelResultado = new JPanel();

    public JLabel cedula_lb;
    public JTextField cedula_txt;
    public JTextArea areaTratamiento;
    public JTextArea areaApoyo;
    public JLabel tituloApoyo;
    public JLabel tituloTratamiento;
    public JButton botonVolver;
    public JButton botonBuscar;
    Font fuenteBoton = new Font("Century Schoolbook", Font.PLAIN, 20);
    Font fuenteLabel = new Font("Century Schoolbook", Font.BOLD, 16);
    

    public ResultadosPaciente() {

        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(800, 800);
        this.setContentPane(panelResultado);
        panelResultado.setBackground(new Color(209, 242, 235));
        setLocationRelativeTo(null);
        panelResultado.setLayout(null);
        Elementos();

    }

    public void Elementos() {

        // JTextArea
        JTextArea areaTratamiento = new JTextArea();
        areaTratamiento.setBounds(15, 300, 350, 300);

        JTextArea areaApoyo = new JTextArea();
        areaApoyo.setBounds(420, 300, 350, 300);

        //JLabel
        tituloApoyo = new JLabel("Apoyo:");
        tituloApoyo.setBounds(440, 230, 400, 70);
        tituloApoyo.setFont(fuenteLabel);

        tituloTratamiento = new JLabel("Tratamiento:");
        tituloTratamiento.setBounds(15, 230, 400, 70);
        tituloTratamiento.setFont(fuenteLabel);

        cedula_lb = new JLabel("Cédula: ");
        cedula_lb.setBounds(30, 70, 400, 70);
        cedula_lb.setFont(fuenteLabel);

        //JTextField
        cedula_txt = new JTextField();
        cedula_txt.setBounds(110, 100, 150, 20);
        cedula_txt.setFont(fuenteLabel);
        


        //JButton
        botonVolver = new JButton();
        botonVolver.setBounds(40, 700, 65, 30);
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

        botonBuscar = new JButton();
        botonBuscar.setBounds(300, 100, 65, 30);
        botonBuscar.setBackground(new Color(209, 242, 235));
        botonBuscar.addActionListener(this);
        botonBuscar.setOpaque(false);
        botonBuscar.setContentAreaFilled(false);
        botonBuscar.setBorderPainted(false);
        ImageIcon iconoBuscar = new ImageIcon("Vista/Imagenes/Buscar.png");
        if (iconoBuscar != null && iconoBuscar.getImage() != null) {
            Image imagenBuscarAjustada = iconoBuscar.getImage().getScaledInstance(55, 40, Image.SCALE_SMOOTH);
            botonBuscar.setIcon(new ImageIcon(imagenBuscarAjustada));
        }

        panelResultado.add(areaTratamiento);
        panelResultado.add(areaApoyo);
        panelResultado.add(tituloApoyo);
        panelResultado.add(tituloTratamiento);
        panelResultado.add(botonVolver);
        panelResultado.add(botonBuscar);
        panelResultado.add(cedula_txt);
        panelResultado.add(cedula_lb);

    }

    public void actionPerformed(ActionEvent e) {

        // Ciclo if en caso de que se seleccione la opcion "Administrativo"

        if (e.getSource() == botonVolver) {
            JOptionPane.showMessageDialog(null, "Volviendo al Menú Principal");
            MenuPrimeraVista instancPrimeraVista = new MenuPrimeraVista();
            instancPrimeraVista.setVisible(true);
            this.dispose();

        }

    }

}

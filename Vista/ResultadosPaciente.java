package Vista;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResultadosPaciente extends JFrame implements ActionListener {

    public JPanel panelResultado = new JPanel();
    
    public JTextArea areaTratamiento;
    public JTextArea areaApoyo;
    public JLabel tituloApoyo;
    public JLabel tituloTratamiento;
    public JButton botonCancelar;
    public JButton botonAceptar;




    public ResultadosPaciente (){

        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(800, 800);
        this.setContentPane(panelResultado);
        panelResultado.setBackground(new Color(119, 176, 178));
        setLocationRelativeTo(null);
        panelResultado.setLayout(null);

        Elementos();


    }

    public void Elementos (){
//JTextArea

        JTextArea areaTratamiento = new JTextArea();
        areaTratamiento.setBounds(15,60,350,500);

        JTextArea areaApoyo = new JTextArea();
        areaApoyo.setBounds(420,60,350,500);



        tituloApoyo = new JLabel("Apoyo:");
        tituloApoyo.setBounds(440, 5, 400, 70);
        Font fuente1 = new Font("Century Schoolbook", Font.PLAIN, 20); //
        tituloApoyo.setFont(fuente1);
        tituloApoyo.setForeground(new Color(81, 33, 176));

        tituloTratamiento = new JLabel("Tratamiento:");
        tituloTratamiento.setBounds(15, 5, 400, 70);
        Font fuente2 = new Font("Century Schoolbook", Font.PLAIN, 20); //
        tituloTratamiento.setFont(fuente2);
        tituloTratamiento.setForeground(new Color(81, 33, 176));


        botonAceptar = new JButton("Aceptar");
        botonAceptar.setBounds(570,600,200,30);
        botonAceptar.setForeground(Color.BLACK);
        botonAceptar.addActionListener(this);
        

        botonCancelar = new JButton("Cancelar");
        botonCancelar.setBounds(10, 600, 200, 30);
        botonCancelar.setForeground(Color.BLACK);
        botonCancelar.addActionListener(this);






        panelResultado.add(areaTratamiento);
        panelResultado.add(areaApoyo);
        panelResultado.add(tituloApoyo);
        panelResultado.add(tituloTratamiento);
        panelResultado.add(botonAceptar);
        panelResultado.add(botonCancelar);




    }
    public void actionPerformed(ActionEvent e) {

        // Ciclo if en caso de que se seleccione la opcion "Administrativo"
        if (e.getSource() == botonAceptar) {
            JOptionPane.showMessageDialog(null, "¡Paciente atendido! \nRegresando al menú principal");
            MenuPrimeraVista instancPrimeraVista = new MenuPrimeraVista();
            instancPrimeraVista.setVisible(true);
            this.dispose();
            // Ciclo if en caso de que se seleccione la opcion "Paciente"

        } else if (e.getSource() == botonCancelar) {
            VentanaInformacionPaciente instanciaPaciente = new VentanaInformacionPaciente();
            instanciaPaciente.setVisible(true);
            this.dispose();

        }

    }
    
}

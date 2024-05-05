package Vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class ResultadosPaciente extends JFrame {

    public JPanel panelResultado = new JPanel();


    public ResultadosPaciente (){

        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(800, 800);
        this.setContentPane(panelResultado);
        panelResultado.setBackground(new Color(119, 176, 178));
        setLocationRelativeTo(null);
        panelResultado.setLayout(null);



    }
    
}

package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EditarPaciente extends JFrame implements ActionListener, MouseListener {

    private JPanel panelEditarPaciente = new JPanel();
    private JButton guardar_btn, volver_btn;
    public static JTextField nombrePaciente_txt;
    public static JTextField cedulaPaciente_txt;
    public static JTextField edadPaciete_txt;
    public static JTextField sexoPaciente_txt;
    public static JTextField transtornoPaciente_txt;
    private JLabel nombrePaciente_lb, cedulaPaciente_lb, edadPaciente_lb,
            sexoPaciente_lb, transtornoPaciente_lb;
    Font fuente = new Font("Century Schoolbook", Font.PLAIN, 14);

    public EditarPaciente() {

        // Ajustes para la ventana
        this.setTitle("Editar Paciente");
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(500, 500);
        setLocationRelativeTo(null);
        this.getContentPane().add(panelEditarPaciente);
        panelEditarPaciente.setBackground(new Color(119, 176, 178));
        panelEditarPaciente.setLayout(null);
        Elementos();// llamada al metodo de elementos para agregar los elementos del panel a la
                    // interfaz grafica

    }

    public void Elementos() {

        // JLABEL
        nombrePaciente_lb = new JLabel("Nombre: ");
        nombrePaciente_lb.setBounds(30, 60, 200, 30);

        cedulaPaciente_lb = new JLabel("Cédula: ");
        cedulaPaciente_lb.setBounds(30, 120, 200, 30);

        edadPaciente_lb = new JLabel("Edad: ");
        edadPaciente_lb.setBounds(30, 180, 200, 30);

        sexoPaciente_lb = new JLabel("Sexo: ");
        sexoPaciente_lb.setBounds(30, 240, 200, 30);

        transtornoPaciente_lb = new JLabel("Transtorno: ");
        transtornoPaciente_lb.setBounds(30, 300, 200, 30);

        // JTEXTFIELD
        nombrePaciente_txt = new JTextField(" ");
        nombrePaciente_txt.setBounds(120, 60, 200, 30);

        cedulaPaciente_txt = new JTextField(" ");
        cedulaPaciente_txt.setBounds(120, 120, 200, 30);

        edadPaciete_txt = new JTextField(" ");
        edadPaciete_txt.setBounds(120, 180, 200, 30);

        sexoPaciente_txt = new JTextField(" ");
        sexoPaciente_txt.setBounds(120, 240, 200, 30);

        transtornoPaciente_txt = new JTextField(" ");
        transtornoPaciente_txt.setBounds(120, 300, 200, 30);

        // JBUTTON
        guardar_btn = new JButton(" ");
        guardar_btn.setBounds(40, 350, 80, 50);
        ImageIcon iconoGuardar = new ImageIcon("Vista/Imagenes/guardar1.png");
        Image imagenGuardar = iconoGuardar.getImage();
        Image imagenGuardarAjustada = imagenGuardar.getScaledInstance(90, 60, Image.SCALE_SMOOTH);
        ImageIcon iconoGuardarAjustada = new ImageIcon(imagenGuardarAjustada);
        guardar_btn.setIcon(iconoGuardarAjustada);

        volver_btn = new JButton();
        volver_btn.setBounds(40, 425, 70, 30);
        volver_btn.addActionListener(this);
        volver_btn.setBackground(new Color(119, 176, 178));
        ImageIcon iconoVolver = new ImageIcon("Vista/Imagenes/volver2.png");
        Image imagenVovler = iconoVolver.getImage();
        Image imagenVolverAjustada = imagenVovler.getScaledInstance(55, 40, Image.SCALE_SMOOTH);
        ImageIcon iconoVolverAjustada = new ImageIcon(imagenVolverAjustada);
        volver_btn.setIcon(iconoVolverAjustada);

        // AGREGAR ELEMENTOS AL PANEL 
        panelEditarPaciente.add(nombrePaciente_lb);
        panelEditarPaciente.add(cedulaPaciente_lb);
        panelEditarPaciente.add(edadPaciente_lb);
        panelEditarPaciente.add(sexoPaciente_lb);
        panelEditarPaciente.add(transtornoPaciente_lb);
        panelEditarPaciente.add(nombrePaciente_txt);
        panelEditarPaciente.add(cedulaPaciente_txt);
        panelEditarPaciente.add(edadPaciete_txt);
        panelEditarPaciente.add(sexoPaciente_txt);
        panelEditarPaciente.add(transtornoPaciente_txt);
        panelEditarPaciente.add(guardar_btn);
        panelEditarPaciente.add(volver_btn);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == volver_btn) {

           
            VentanaOpcionesAdministrativo ventanaOpcionesAdministrativo = new VentanaOpcionesAdministrativo();
            ventanaOpcionesAdministrativo.setVisible(true);
            this.dispose();
        }

        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        

        throw new UnsupportedOperationException("Unimplemented method 'mouseClicked'");
    }

    @Override
    public void mousePressed(MouseEvent e) {

        throw new UnsupportedOperationException("Unimplemented method 'mousePressed'");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mouseReleased'");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mouseEntered'");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mouseExited'");
    }

}

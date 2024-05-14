import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Interfaces1 {
    public static void main(String[] args) {
        
        //Creacion del frame
        JFrame frame = new JFrame("Primer programa de Java Swing");

        //Cambiar tamaño del frame
        frame.setSize(600, 500);

        //Accion de cierre
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Crear un label
        JLabel label = new JLabel ("Hola, mundo");

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));

        //Crear boton
        JButton button = new JButton("Haz click aqui");

        //Configurar tamaña del boton
        button.setPreferredSize(new Dimension(100, 50));

        buttonPanel.add(button);

        //Añadir elementos al frame
        frame.add(label, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);

        //Programar el evento
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(frame, "ha hecho click en el boton");
            
            }

        }
        );

        //Hacerlo visible
        frame.setVisible(true);

    }
    
}

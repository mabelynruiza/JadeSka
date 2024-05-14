import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class InterfacesSwing1 {
    public static void main(String[] args) {
        
        //Crecion del frame con JFrame
        JFrame frame = new JFrame( "Primer ejemplo de java Swing");

        //Ajustamos el tamaño del frame
        frame.setSize( 400, 300);

        //Cerrar por medio de la x
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Crear un label
        JLabel label = new JLabel ("Hola, mundo");

        //Crear botones
        JButton button = new JButton("Haz click aqui");

        //Agregar label y boton al frame
        frame.getContentPane().add(label);
        frame.getContentPane().add(button);

        //Organizar los componentes
        frame.add(label, BorderLayout.NORTH);
        frame.add(button, BorderLayout.CENTER);

        //Agregue una accion al boton
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                JOptionPane.showMessageDialog(frame, "Ha hecho click en el boton");

            }
        }
        );

        //Hacer visible el frame
        frame.setVisible(true);
    }
    
}

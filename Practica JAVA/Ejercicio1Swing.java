import javax.swing.*;

public class Ejercicio1Swing {
    public static void main(String[] args){

        //Mostrar mensaje para ingresar un numero
        String mensaje1 = JOptionPane.showInputDialog("Ingrese un numero: ");
    
        //Convertir lo que el usuario ingrese a entero
        int numero1 = Integer.parseInt(mensaje1);

        //Mostrar mensaje para solicitar otro numero
        String mensaje2 = JOptionPane.showInputDialog("");

        //Convertir lo que el usuario ingrese a entero
        int numero2 = Integer.parseInt(mensaje2);

        int suma = numero1 + numero2;

        JOptionPane.showMessageDialog(null, "La suma es " + suma);
        

    }
}
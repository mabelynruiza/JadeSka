import javax.swing.*;

public class Ejercicio2Swing {
    public static void main(String[] args){


        //Solicitar nombre del usuario
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");

        //Solicitar al usuario la edad
        String edad = JOptionPane.showInputDialog("Ingrese su edad: ");

        //Convertir edad a entero
        int edad_final = Integer.parseInt(edad);

        //Construir mensajes dentro de la variable
        String mensaje = "Hola, " + nombre + ".";

        if (edad_final >= 18) {

            mensaje += "Usted es mayor de edad.";

        } else {
            mensaje += "Usted es menor de edad.";

        }

        JOptionPane.showMessageDialog(null, mensaje);

    }
}

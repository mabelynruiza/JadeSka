import java.util.Scanner; //Paso 1

public class Teclado1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in); //Paso 2

        //Paso 3 - solicitud de datos por teclado
        System.out.println("Ingrese su nombre: ");
        String nombre = teclado.nextLine(); //NextLine = texto, string, palabras, etc

        System.out.println("Ingrese su edad: ");
        int edad = teclado.nextInt(); //nextInt = numeros enteros

        System.out.println("Ingrese su altura: ");
        double altura = teclado.nextDouble(); //nextDouble = numeros decimales

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);

        //Paso 4 - cerrar el teclado
        teclado.close();

    }
}
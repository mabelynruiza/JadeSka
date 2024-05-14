import java.util.Scanner;

public class Vectores2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //Declaracion de vectores
        String[] nombres = new String[5];
        int[] notas = new int[5];

        for (int i = 0; i < nombres.length; i++) {

            System.out.println("Ingrese el nombre del estudiante: ");
            nombres[i] = teclado.nextLine();
            System.out.println("Ingrese la nota del estudiante: ");
            notas[i] = teclado.nextInt();
            teclado.nextLine();
            
        }

        System.out.println("Datos de estudiantes");
        for (int i = 0; i < nombres.length; i++) {
            
            System.out.println("Estudiante #" + (i + 1) + ": "  + nombres[i]);
            System.out.println("Nota del estudiante #" + (i + 1) + ": " + notas[i]);

        }
        teclado.close();
    }
}
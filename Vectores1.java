import java.util.Scanner;

public class Vectores1 {
    public static void main(String[] args) {
        // Creación de un objeto Scanner para leer la entrada del teclado
        Scanner teclado = new Scanner(System.in);

        // Creación de vector
        int[] numeros = {1, 2, 3, 4, 5};

        System.out.println("Numeros: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        // Cerrar el objeto Scanner después de su uso
        teclado.close();
    }
}

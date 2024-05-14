import java.util.Scanner;

public class CicloDoWhile1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int suma = 0; // Inicializada
        int promedio = 0; // Inicializada
        int valor; // Creada
        int cant = 0; // Declarada e inicializada

        do {
            System.out.println("Ingrese un valor (para finalizar, ingrese 0): ");
            valor = teclado.nextInt();

            if (valor != 0) {
                suma += valor;
                cant++;
            }

        } while (valor != 0);

        if (cant != 0) {
            // Calcular el promedio como un número de punto flotante
            promedio = (int) ((double) suma / cant);
            System.out.println("El promedio de los valores ingresados es: " + promedio);
        } else {
            System.out.println("No se ingresaron valores");
        }

        teclado.close();
    }
}
import java.util.Scanner;

        public class Condicionales {
            public static void main(String[] args) {

                Scanner teclado = new Scanner(System.in);

                System.out.println("Ingrese numero: ");
                int numero = teclado.nextInt();

            if (numero > 0) {

                System.out.println("El numero " + numero + " es positivo.");

            }
            else if (numero < 0) {

                System.out.println("El numero " + numero + " es negativo.");

            }
            else {

                System.out.println("El numero es igual a 0 ");

            }

            teclado.close();
        }
    
}

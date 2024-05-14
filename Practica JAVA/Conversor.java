import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    System.out.println("Le damos la Bienvenida");
    System.out.println("Seleccione una opcion");
    System.out.println("1, Compra (USD a CRC)");
    System.out.println("2, Compra (CRC a USD)");
    System.out.println("Espacio para ingresar la opcion");
    int opcion = teclado.nextInt( );

//creacion de las variables
        double cantidad = 0;
        double total = 0;

        switch ( opcion ) {
            case 1: //compra
                System.out.println("Ingrese la cantidad de dinero a convertir: ");
                cantidad = teclado.nextDouble();

                total = cantidad * 499.47;
                System.out.println("Resultado de la conversion: " + total + "colones.");


                break;
            case 2: //venta
                System.out.println("Ingrese la cantidad de dinero a convertir: ");
                cantidad = teclado.nextDouble();

                total = cantidad / 505.46;
                System.out.println("Resultado de la conversion: " + total + "colones.");

                break;

            default:
                break;
        }

        teclado.close();

    }
}

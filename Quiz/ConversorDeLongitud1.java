import java.util.Scanner;

public class ConversorDeLongitud1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Bienvenido al Conversor de Longitud");

            while (true) {
                // Menú de opciones
                System.out.println("\nElija una opción:");
                System.out.println("1. Convertir de metros a centímetros");
                System.out.println("2. Convertir de centímetros a metros");
                System.out.println("3. Convertir de centímetros a pulgadas");
                System.out.println("4. Convertir de pulgadas a centímetros");
                System.out.println("5. Salir");
                System.out.print("Ingrese el número de la opción: ");

                int opcion;
                if (scanner.hasNextInt()) {
                    opcion = scanner.nextInt();
                } else {
                    System.out.println("Entrada no válida. Por favor, ingrese un número.");
                    scanner.next(); // Limpiar el búfer del scanner
                    continue;
                }

                // Variables para almacenar la longitud y el resultado de la conversión
                double longitud, resultado;

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese la longitud en metros: ");
                        longitud = scanner.nextDouble();
                        resultado = metrosACentimetros(longitud);
                        System.out.println("La longitud en centímetros es: " + resultado);
                        break;
                    case 2:
                        System.out.print("Ingrese la longitud en centímetros: ");
                        longitud = scanner.nextDouble();
                        resultado = centimetrosAMetros(longitud);
                        System.out.println("La longitud en metros es: " + resultado);
                        break;
                    case 3:
                        System.out.print("Ingrese la longitud en centímetros: ");
                        longitud = scanner.nextDouble();
                        resultado = centimetrosAPulgadas(longitud);
                        System.out.println("La longitud en pulgadas es: " + resultado);
                        break;
                    case 4:
                        System.out.print("Ingrese la longitud en pulgadas: ");
                        longitud = scanner.nextDouble();
                        resultado = pulgadasACentimetros(longitud);
                        System.out.println("La longitud en centímetros es: " + resultado);
                        break;
                    case 5:
                        System.out.println("¡Hasta luego!");
                        return;
                    default:
                        System.out.println("Opción no válida. Por favor, ingrese un número del 1 al 5.");
                }
            }
        }
    }

    // Funciones para realizar las conversiones
    public static double metrosACentimetros(double metros) {
        return metros * 100;
    }

    public static double centimetrosAMetros(double centimetros) {
        return centimetros / 100;
    }

    public static double centimetrosAPulgadas(double centimetros) {
        return centimetros / 2.54;
    }

    public static double pulgadasACentimetros(double pulgadas) {
        return pulgadas * 2.54;
    }
}
import java.util.Scanner;

public class CalculadoraDeCompras1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double total = 0;

            System.out.println("Bienvenido a la tienda Skyline");

            // Ciclo para ingresar los artículos
            while (true) {
                System.out.print("Ingrese el nombre del artículo (o 0 para terminar): ");
                String nombreArticulo = scanner.nextLine();

                // Si el usuario ingresa "0", se termina el ciclo
                if (nombreArticulo.equals("0")) {
                    break;
                }

                double precioArticulo = ingresarPrecio(scanner);

                int cantidad = ingresarCantidad(scanner);

                // Calcular el subtotal del artículo
                double subtotal = precioArticulo * cantidad;

                // Agregar el subtotal al total
                total += subtotal;
            }

            // Mostrar el total a pagar al usuario
            System.out.println("El total a pagar es: $" + total);
        }
    }

    // Método para ingresar el precio del artículo
    private static double ingresarPrecio(Scanner scanner) {
        while (true) {
            System.out.print("Ingrese el precio del artículo: ");
            if (scanner.hasNextDouble()) {
                double precio = scanner.nextDouble();
                if (precio >= 0) {
                    scanner.nextLine(); // Limpiar el buffer del scanner
                    return precio;
                }
            }
            System.out.println("Precio inválido. Por favor, ingrese un número positivo.");
            scanner.nextLine(); // Limpiar el buffer del scanner
        }
    }

    // Método para ingresar la cantidad del artículo
    private static int ingresarCantidad(Scanner scanner) {
        while (true) {
            System.out.print("Ingrese la cantidad que desea comprar de este artículo: ");
            if (scanner.hasNextInt()) {
                int cantidad = scanner.nextInt();
                if (cantidad >= 0) {
                    scanner.nextLine(); // Limpiar el buffer del scanner
                    return cantidad;
                }
            }
            System.out.println("Cantidad inválida. Por favor, ingrese un número entero positivo.");
            scanner.nextLine(); // Limpiar el buffer del scanner
        }
    }
}
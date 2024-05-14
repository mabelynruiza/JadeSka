import java.util.Scanner;

public class CalculadoraDeCompras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double total = 0;

        System.out.println("Bienvenido a la tienda");

        // Ciclo para ingresar los artículos
        while (true) {
            System.out.print("Ingrese el nombre del artículo (o 0 para terminar): ");
            String nombreArticulo = scanner.nextLine();

            // Si el usuario ingresa "0", se termina el ciclo
            if (nombreArticulo.equals("0")) {
                break;
            }

            System.out.print("Ingrese el precio del artículo: ");
            double precioArticulo = scanner.nextDouble();

            System.out.print("Ingrese la cantidad que desea comprar de este artículo: ");
            int cantidad = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            // Calcular el subtotal del artículo
            double subtotal = precioArticulo * cantidad;

            // Agregar el subtotal al total
            total += subtotal;
        }

        // Mostrar el total a pagar al usuario
        System.out.println("El total a pagar es: $" + total);

        scanner.close();
    }
}

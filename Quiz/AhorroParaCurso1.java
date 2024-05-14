import java.util.Scanner;

public class AhorroParaCurso1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la cantidad que desea ahorrar
        System.out.print("Ingrese la cantidad que desea ahorrar: ");
        double cantidadObjetivo = scanner.nextDouble();
        if (cantidadObjetivo <= 0) {
            System.out.println("La cantidad a ahorrar debe ser mayor que cero.");
        }

        // Solicitar al usuario que ingrese su salario mensual
        System.out.print("Ingrese su salario mensual: ");
        double salarioMensual = scanner.nextDouble();
        if (salarioMensual <= 0) {
            System.out.println("El salario mensual debe ser mayor que cero.");
        }

        // Solicitar al usuario que ingrese sus gastos mensuales
        System.out.print("Ingrese sus gastos mensuales: ");
        double gastosMensuales = scanner.nextDouble();
        if (gastosMensuales < 0 || gastosMensuales >= salarioMensual) {
            System.out.println("Los gastos mensuales deben ser positivos y menores que el salario mensual.");
        }

        // Calcular el saldo mensual disponible para ahorrar
        double saldoDisponible = salarioMensual - gastosMensuales;
        if (saldoDisponible <= 0) {
            System.out.println("No hay suficiente saldo disponible para ahorrar.");
        }

        // Calcular cuántos meses le llevará ahorrar la cantidad objetivo
        double mesesParaObjetivo = Math.ceil(cantidadObjetivo / saldoDisponible);

        // Mostrar el resultado al usuario
        if (Double.isInfinite(mesesParaObjetivo)) {
            System.out.println("¡Felicidades! ¡Puedes ahorrar la cantidad objetivo este mismo mes!");
        } else {
            System.out.println("Le llevará " + (int) mesesParaObjetivo + " meses ahorrar la cantidad objetivo de $" + cantidadObjetivo);
        }
        
            scanner.close();
    }
}
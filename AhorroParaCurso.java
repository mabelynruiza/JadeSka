import java.util.Scanner;

public class AhorroParaCurso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese su salario mensual
        System.out.print("Ingrese su salario mensual: ");
        double salarioMensual = scanner.nextDouble();

        // Solicitar al usuario que ingrese sus gastos mensuales
        System.out.print("Ingrese sus gastos mensuales: ");
        double gastosMensuales = scanner.nextDouble();

        // Calcular el saldo mensual disponible para ahorrar
        double saldoDisponible = salarioMensual - gastosMensuales;

        // Calcular cuántos meses le llevará ahorrar lo suficiente para el curso de $1000
        final double costoCurso = 1000.0;
        int mesesParaCurso = (int) Math.ceil(costoCurso / saldoDisponible);

        // Mostrar el resultado al usuario
        System.out.println("Le llevará " + mesesParaCurso + " meses ahorrar lo suficiente para el curso de $" + costoCurso);
        
        scanner.close();
    }
}

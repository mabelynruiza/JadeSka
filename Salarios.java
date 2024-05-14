import java.util.Scanner;

public class Salarios {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese su salario mensual: ");
        double salario = teclado.nextDouble();

        System.out.println("Ingrese la cantidad de años que lleva trabajando en la empresa: ");
        int anios = teclado.nextInt();

        System.out.println("ingrese la cantidad de horas que trabajo en la semana: " );
        double horas = teclado.nextDouble();
        
        double salario_final = calculo_salario(salario, anios);

        double salario_extra = horas_extras( horas, salario_final);

        System.out.println("El salario despues de " + anios + "años en la empresa es igual a: " + salario_final);
        System.out.println("El salario con horas extra es igual a: " + salario_extra);

        teclado.close();

    }

    public static double calculo_salario(double salario_actual, int anios_actuales) {

        if(anios_actuales >= 10) {

            return salario_actual * 1.10;
        
        } else {

            return salario_actual;

        }

    }

    public static double horas_extras(double cantidad_horas, double salario_extras) {

        if (cantidad_horas > 40) {

            double calculo = cantidad_horas - 40;
            double salario_total = salario_extras + (calculo * (salario_extras / 40));

            return salario_total;

        }
        else {
            
            return salario_extras;

        }
    }
}

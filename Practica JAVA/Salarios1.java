import java.util.Scanner;

public class Salarios1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese su salario mensual: ");
        double salario = teclado.nextDouble();

        System.out.println("Ingrese la cantidad de años que lleva trabajando en la empresa: ");
        int anios = teclado.nextInt();

        double salario_final = calculo_aumento(salario, anios);

        int pension = calculo_cuotas(anios);

        System.out.println("El salario actual; despues de " + anios + " es igual a : " + salario_final);
        System.out.println("La cantidad de cuatas para la pension restantes corresponde a: " + pension);

        teclado.close();
    
    }

    public static double calculo_aumento (double salario_actual, int anios_actuales) {

        if(anios_actuales >= 10) {

            return salario_actual * 1.10;

        } else {

            return salario_actual;

        }

    }

    public static int calculo_cuotas(int anios_pension){

        return 360 - (anios_pension *12);

    }

}
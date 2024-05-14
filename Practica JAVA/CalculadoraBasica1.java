import java.util.Scanner;

public class CalculadoraBasica1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println("Calculadora Basica");
        System.out.println("--------------------");
        System.out.println("Opciones:\n1)Suma\n2)Resta\n3)Multiplicacion\n4)Division");
        int opcion = sc.nextInt();

        if (opcion < 1 || opcion > 4) {
            System.out.println("Opcion no posible");
        } else {
            System.out.println("Dar primer valor");
            double variable1 = sc.nextDouble();
            System.out.println("Dar segundo valor");
            double variable2 = sc.nextDouble();
            double resultado;

            if (opcion == 1) {
                resultado = variable1 + variable2;
                System.out.println("La suma es: " + resultado);
            } else if (opcion == 2) {
                resultado = variable1 - variable2;
                System.out.println("La resta es: " + resultado);
            } else if (opcion == 3) {
                resultado = variable1 * variable2;
                System.out.println("La multiplicacion es: " + resultado);
            } else if (opcion == 4) {
                if (variable2 == 0) {
                    System.out.println("No se puede dividir entre cero");
                } else {
                    resultado = variable1 / variable2;
                    System.out.println("La division es: " + resultado);
                }
            }
        }
        sc.close();
    }
}

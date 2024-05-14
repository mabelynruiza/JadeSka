import java.util.Scanner;

public class CicloWhile {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int suma = 0;
        int num = 0;

        while(true){

            System.out.println("Ingrese un numero: ");
            num = teclado.nextInt();

            if(num == 0){
                break;
            }

            suma = suma + num;

        }

        System.out.println("La suma de los numeros ingresados es igual a: " + suma);

        teclado.close();

    }
}

import java.util.Scanner;


public class CicloFor {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int aprovados = 0; //Inicializada
        int reprobados = 0; //Inicializada
        int nota; //Creada
        

        int estudiantes = 56;

        for (int i = 1; i <= 10; i++) {

            System.out.println("Ingrese la nota del estudiante #" + i + ": " );
            nota = teclado.nextInt();

            if (nota >=70) {

                

                aprovados++;
            }
            else{
                reprobados++;
            }

        }

        System.out.println("Cantidad de aprobados: " + aprovados);
        System.out.println("Cantidad de reprobados: " + reprobados);

        teclado.close();

    }

}
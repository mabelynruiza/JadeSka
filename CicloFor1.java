import java.util.Scanner;

public class CicloFor1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int aprobados = 0; // Inicializada
        int reprobados = 0; // Inicializada
        int nota; // Creada

        int totalEstudiantes = 56;

        for (int i = 1; i <= totalEstudiantes; i++) {
            System.out.println("Ingrese la nota del estudiante #" + i + ": ");
            nota = teclado.nextInt();

            if (nota >= 70) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de reprobados: " + reprobados);

        teclado.close();
    }
}
import java.util.Scanner;
import java.text.DecimalFormat;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formatoDecimal = new DecimalFormat("#.##"); 

        int totalAlumnos = 34;
        int i = 1;
        do {
            System.out.println("Alumno " + i + ":");
            double suma = 0;
            int j = 1;
            do {
                System.out.print("Ingrese la calificación " + j + ": ");
                double calificacion = scanner.nextDouble();
                while (calificacion < 0 || calificacion > 10) {
                    System.out.println("La calificación debe estar entre 0 y 10. Intente nuevamente.");
                    System.out.print("Ingrese la calificación " + j + ": ");
                    calificacion = scanner.nextDouble();
                }

                suma += calificacion;
                j++;
            } while (j <= 5);
            double promedio = suma / 5;
            System.out.println("Promedio del Alumno " + i + ": " + formatoDecimal.format(promedio));
            System.out.println();

            i++;
        } while (i <= totalAlumnos);

        scanner.close();
    }
}

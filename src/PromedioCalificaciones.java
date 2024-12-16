import java.util.Scanner;
import java.text.DecimalFormat;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formatoDecimal = new DecimalFormat("#.##");
        procesarAlumno(scanner, 1, 34, formatoDecimal);

        scanner.close(); 
        
    }
    public static void procesarAlumno(Scanner scanner, int i, int totalAlumnos, DecimalFormat formatoDecimal) {
        if (i > totalAlumnos) {
            return;
        }

        System.out.println("Alumno " + i + ":");
        double suma = 0;
        suma = ingresarCalificaciones(scanner, 1, 5, suma);
        double promedio = suma / 5;
        System.out.println("Promedio del Alumno " + i + ": " + formatoDecimal.format(promedio));
        System.out.println();
        procesarAlumno(scanner, i + 1, totalAlumnos, formatoDecimal);
    }
    public static double ingresarCalificaciones(Scanner scanner, int j, int totalCalificaciones, double suma) {
        if (j > totalCalificaciones) {
            return suma;
        }
        System.out.print("Ingrese la calificación " + j + ": ");
        double calificacion = scanner.nextDouble();
        calificacion = validarCalificacion(scanner, calificacion, j);
        suma += calificacion;
        return ingresarCalificaciones(scanner, j + 1, totalCalificaciones, suma);
    }
    public static double validarCalificacion(Scanner scanner, double calificacion, int j) {
        if (calificacion < 0 || calificacion > 10) {
            System.out.println("La calificación debe estar entre 0 y 10. Intente nuevamente.");
            System.out.print("Ingrese la calificación " + j + ": ");
            calificacion = scanner.nextDouble();
            return validarCalificacion(scanner, calificacion, j);
        }
        return calificacion;
    }
}

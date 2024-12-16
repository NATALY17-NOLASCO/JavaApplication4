import java.util.Scanner;
public class Hospital {

    public static void main(String[] args) {
        double totalDinero = 2000000;
        double pediatria, analisisClinicos, ginecologia, infraestructura, serviciosGenerales;
        double porcentajeServiciosGenerales;
        pediatria = totalDinero * 0.20;        // 20% para Pediatría
        analisisClinicos = totalDinero * 0.15; // 15% para Análisis Clínicos
        ginecologia = totalDinero * 0.40;      // 40% para Ginecología
        infraestructura = totalDinero * 0.10;  // 10% para Infraestructura en Sanitarios
        serviciosGenerales = totalDinero - (pediatria + analisisClinicos + ginecologia + infraestructura);
        porcentajeServiciosGenerales = (serviciosGenerales / totalDinero) * 100; // Calcular el porcentaje restante
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el área para ver su distribución: ");
        System.out.println("1. Pediatría");
        System.out.println("2. Análisis Clínicos");
        System.out.println("3. Ginecología");
        System.out.println("4. Infraestructura en Sanitarios");
        System.out.println("5. Servicios Generales");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Área: Pediatría");
                System.out.println("Monto asignado: $" + pediatria);
                System.out.println("Porcentaje: 20%");
                break;
            case 2:
                System.out.println("Área: Análisis Clínicos");
                System.out.println("Monto asignado: $" + analisisClinicos);
                System.out.println("Porcentaje: 15%");
                break;
            case 3:
                System.out.println("Área: Ginecología");
                System.out.println("Monto asignado: $" + ginecologia);
                System.out.println("Porcentaje: 40%");
                break;
            case 4:
                System.out.println("Área: Infraestructura en Sanitarios");
                System.out.println("Monto asignado: $" + infraestructura);
                System.out.println("Porcentaje: 10%");
                break;
            case 5:
                System.out.println("Área: Servicios Generales");
                System.out.println("Monto asignado: $" + serviciosGenerales);
                System.out.println("Porcentaje: " + porcentajeServiciosGenerales + "%");
                break;
            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}

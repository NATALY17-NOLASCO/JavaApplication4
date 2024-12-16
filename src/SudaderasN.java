import java.util.Scanner;
public class SudaderasN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántas compras deseas registrar? ");
        int numCompras = scanner.nextInt();
        String[] distribuidores = new String[numCompras];
        int[] cantidades = new int[numCompras];
        double[] preciosUnitarios = new double[numCompras];
        double[] totales = new double[numCompras];
        String[] meses = new String[numCompras];
        double totalVentasMayoristas = 0;
        double totalVentasMenudeo = 0;
        for (int i = 0; i < numCompras; i++) {
            System.out.println("\nCompra #" + (i + 1));

            System.out.print("Ingrese el mes de la compra: ");
            scanner.nextLine(); 
            meses[i] = scanner.nextLine();

            System.out.print("Ingrese el nombre del distribuidor: ");
            distribuidores[i] = scanner.nextLine();

            System.out.print("Ingrese la cantidad de sudaderas: ");
            cantidades[i] = scanner.nextInt();
            if (cantidades[i] >= 10) {
                preciosUnitarios[i] = 150; 
            } else {
                preciosUnitarios[i] = 150 * 1.60; 
            }
            totales[i] = cantidades[i] * preciosUnitarios[i];
            if (cantidades[i] >= 10) {
                totalVentasMayoristas += totales[i];
            } else {
                totalVentasMenudeo += totales[i];
            }
        }
        System.out.println("\n--- Detalle de las Compras ---");
        System.out.printf("%-5s %-15s %-10s %-15s %-15s %-10s%n", "No.", "Distribuidor", "Mes", "Cantidad", "P.Unitario", "Total");
        System.out.println("----------------------------------------------------------------------------------");
        for (int i = 0; i < numCompras; i++) {
            System.out.printf("%-5d %-15s %-10s %-15d $%-10.2f $%-10.2f%n", 
                (i + 1), distribuidores[i], meses[i], cantidades[i], preciosUnitarios[i], totales[i]);
        }
        System.out.println("\n--- Reporte Mensual ---");
        System.out.println("Total ventas mayoristas: $" + String.format("%.2f", totalVentasMayoristas));
        System.out.println("Total ventas menudeo: $" + String.format("%.2f", totalVentasMenudeo));
        System.out.println("Total general: $" + String.format("%.2f", (totalVentasMayoristas + totalVentasMenudeo)));

        scanner.close();
    }
}


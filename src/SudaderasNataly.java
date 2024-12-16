/*import java.util.Scanner;
public class SudaderasNataly {
    public static void main (String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("¿Cuatas compras deseas registrar este mes?");
        int numCompras= scanner.nextInt();
        String [] distribuidores= new String [numCompras];
        int[] cantidades = new int[numCompras];
        double []preciosUnitarios=new double[numCompras];
        double[]totales= new double [numCompras];
        double totalVentasMayoristas=0;
        double totalVentasMenudeo=0;
        for (int i=0; i<=numCompras;i++){
            System.out.println("\nCompra #" + (i+1));
            System.out.println("Ingrese el nombre del distribuidor: ");
            scanner.nextLine();
            distribuidores[i]= scanner.nextLine();
            System.out.print("Ingrese la cantidad de sudaderas: ");
            cantidades [i]= scanner.nextInt();
            if (cantidades [i]>=10){
                preciosUnitarios[i]=150;
            }else{
                preciosUnitarios[i]=150+1.60;
            }
            totales[i]=cantidades[i]*preciosUnitarios[i];
            if (cantidades[i]>=10){
                totalVentasMayoristas+=totales[i];
            }else{
                totalVentasMenudeo+=totales[i];
            }
            
        }
        System.out.println("\n---Detalle de las compras---");
        for (int i=0; i < numCompras; i++){
            System.out.println("\nCompra#" + (i+1));
            System.out.println("Distribuidor:" + distribuidores [i]);
            System.out.println("Cantidad de sudaderas:" + cantidades[i]);
            System.out.println("Precio Unitario: $" + String.format("%.2f", preciosUnitarios[i]));
            System.out.println("Total de la compra: $" + String.format("%.2f",totales[i]));
        }
        System.out.println("\n--Reporte Mensual--");
        System.out.println("Total ventas mayoristas: $" + String.format("%.2f", totalVentasMayoristas));
        System.out.println("Total ventas menudeo: $" + String.format("%.2f", totalVentasMenudeo));
        System.out.println("Total general: $"+ String.format("%.2f", (totalVentasMayoristas + totalVentasMenudeo))) ;
        scanner.close();
        
        
    }
    
}
*/
import java.util.Scanner;

public class SudaderasNataly {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántas compras deseas registrar este mes? ");
        int numCompras = scanner.nextInt();
        String[] distribuidores = new String[numCompras];
        int[] cantidades = new int[numCompras];
        double[] preciosUnitarios = new double[numCompras];
        double[] totales = new double[numCompras];
        double totalVentasMayoristas = 0;
        double totalVentasMenudeo = 0;
        for (int i = 0; i < numCompras; i++) {
            System.out.println("\nCompra #" + (i + 1));

            System.out.print("Ingrese el nombre del distribuidor: ");
            scanner.nextLine(); 
            distribuidores[i] = scanner.nextLine();

            System.out.print("Ingrese la cantidad de sudaderas: ");
            cantidades[i] = scanner.nextInt();
            if (cantidades[i] >= 10) {
                preciosUnitarios[i] = 150; 
            } else {
                preciosUnitarios[i] = 150 * 1.60; 
            }

            // Calcular el total de la compra
            totales[i] = cantidades[i] * preciosUnitarios[i];

            // Sumar al total mensual según el tipo de venta
            if (cantidades[i] >= 10) {
                totalVentasMayoristas += totales[i];
            } else {
                totalVentasMenudeo += totales[i];
            }
        }

        // Imprimir el detalle de las compras
        System.out.println("\n--- Detalle de las Compras ---");
        for (int i = 0; i < numCompras; i++) {
            System.out.println("\nCompra #" + (i + 1));
            System.out.println("Distribuidor: " + distribuidores[i]);
            System.out.println("Cantidad de sudaderas: " + cantidades[i]);
            System.out.println("Precio unitario: $" + String.format("%.2f", preciosUnitarios[i]));
            System.out.println("Total de la compra: $" + String.format("%.2f", totales[i]));
        }

        // Reporte mensual
        System.out.println("\n--- Reporte Mensual ---");
        System.out.println("Total ventas mayoristas: $" + String.format("%.2f", totalVentasMayoristas));
        System.out.println("Total ventas menudeo: $" + String.format("%.2f", totalVentasMenudeo));
        System.out.println("Total general: $" + String.format("%.2f", (totalVentasMayoristas + totalVentasMenudeo)));

        scanner.close();
    }
}
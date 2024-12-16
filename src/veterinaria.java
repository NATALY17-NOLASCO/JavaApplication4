import java.util.Scanner;

public class veterinaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese qué mascota es: perro, gato, conejo, cuyo");
        String animal = scanner.nextLine().toLowerCase();
        
        double precio;
        double descuento;
        
        switch (animal) {
            case "perro":
                precio = 500;
                descuento = 0.20;
                break;
            case "gato":
                precio = 520;
                descuento = 0.10;
                break;
            case "conejo":
                precio = 350;
                descuento = 0.50;
                break;
            case "cuyo":
                precio = 400;
                descuento = 0.80;
                break;
            default:
                System.out.println("No existe este tipo de mascota.");
                return;
        }
        
        double precioFinal = precio - (precio * descuento);
        System.out.println("El precio final es: $" + precioFinal);
    }
}



    

import javax.swing.JOptionPane;
public class Ejercicio4 {
    public static void main(String[] args) {
        // Leer los valores de los catetos
        double cateto1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la longitud del primer cateto: "));
        double cateto2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la longitud del segundo cateto: "));

        // Calcular la hipotenusa usando el teorema de Pitágoras
        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, "La hipotenusa del triángulo es: " + hipotenusa);
    }
}

    

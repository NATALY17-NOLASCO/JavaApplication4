import javax.swing.JOptionPane;
public class Ejercicio6 {
    public static void main(String[] args) {
        // Leer el valor de N
        int N = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entero:"));

        // Verificar si es par o impar
        if (N % 2 == 0) {
            JOptionPane.showMessageDialog(null, N + " es un número par.");
        } else {
            JOptionPane.showMessageDialog(null, N + " es un número impar.");
        }
    }
}

    

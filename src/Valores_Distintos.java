import javax.swing.JOptionPane;

public class Valores_Distintos {
    public static void main(String[] args) {
        int a, b;

        // Leer el valor de a
        a = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de a"));

        // Leer el valor de b
        b = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de b"));

        // Verificar que los valores sean distintos
        if (a == b) {
            JOptionPane.showMessageDialog(null, "Error: Los valores deben ser distintos.");
        } else {
            // Determinar cuál es el mayor
            if (a > b) {
                JOptionPane.showMessageDialog(null, "El valor mayor es: " + a);
            } else {
                JOptionPane.showMessageDialog(null, "El valor mayor es: " + b);
            }
        }
    }
}

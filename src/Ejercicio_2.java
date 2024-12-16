import javax.swing.JOptionPane;

public class Ejercicio_2 {
    public static void main(String[] args) {
        int A, B, C;

        // Leer los valores A, B y C
        A = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de A"));
        B = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de B"));
        C = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de C"));

        // Verificar que los tres valores sean distintos
        if (A == B || B == C || A == C) {
            JOptionPane.showMessageDialog(null, "Error: Los tres valores deben ser distintos.");
        } else {
            // Determinar el valor mayor
            int mayor;
            if (A > B && A > C) {
                mayor = A;
            } else if (B > A && B > C) {
                mayor = B;
            } else {
                mayor = C;
            }

            // Determinar el valor menor
            int menor;
            if (A < B && A < C) {
                menor = A;
            } else if (B < A && B < C) {
                menor = B;
            } else {
                menor = C;
            }

            // Mostrar el valor mayor y el menor
            JOptionPane.showMessageDialog(null, "El valor mayor es: " + mayor + "\nEl valor menor es: " + menor);
        }
    }
}

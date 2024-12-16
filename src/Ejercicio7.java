import javax.swing.JOptionPane;
public class Ejercicio7 {
    public static void main(String[] args) {
        // Leer la calificación numérica
        int calificacion = Integer.parseInt(JOptionPane.showInputDialog("Introduce la calificación (1-20):"));
        
        // Verificar que la calificación esté entre 1 y 20
        if (calificacion < 1 || calificacion > 20) {
            JOptionPane.showMessageDialog(null, "Error: La calificación debe estar entre 1 y 20.");
        } else {
            String letra = "";

            // Convertir la calificación numérica a letra
            if (calificacion >= 19 && calificacion <= 20) {
                letra = "A";
            } else if (calificacion >= 16 && calificacion <= 18) {
                letra = "B";
            } else if (calificacion >= 13 && calificacion <= 15) {
                letra = "C";
            } else if (calificacion >= 10 && calificacion <= 12) {
                letra = "D";
            } else if (calificacion >= 1 && calificacion <= 9) {
                letra = "E";
            }

            // Mostrar el resultado
            JOptionPane.showMessageDialog(null, "La calificación " + calificacion + " corresponde a la letra: " + letra);
        }
    }
}

    
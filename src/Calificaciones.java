import javax.swing.JOptionPane;

public class Calificaciones {
    public static void main(String[] args) {
        String[] materias = {
            "Matemáticas D", 
            "Cálculo Diferencial", 
            "Fundamentos de Programación", 
            "Química", 
            "Desarrollo Sustentable"
        };
        int[][] calificaciones = new int[materias.length][4];
        for (int i = 0; i < materias.length; i++) {
            for (int j = 0; j < 4; j++) {
                String input = JOptionPane.showInputDialog("Ingresa la calificación " + (j + 1) + " de " + materias[i] + ":");
                calificaciones[i][j] = Integer.parseInt(input);
            }
        }
        System.out.println("Promedio de calificaciones por materia:");
        for (int i = 0; i < materias.length; i++) {
            int suma = 0;
            System.out.print(materias[i] + ": ");
            for (int j = 0; j < calificaciones[i].length; j++) {
                System.out.print(calificaciones[i][j] + " ");
                suma += calificaciones[i][j];
            }
            double promedio = suma / (double)calificaciones[i].length;
            System.out.printf("- Promedio: %.2f\n", promedio);
        }
    }
}

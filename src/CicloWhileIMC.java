import javax.swing.JOptionPane;

public class CicloWhileIMC {
    public static void main(String[] args) {
        while (true) { 
            float peso = Float.parseFloat(JOptionPane.showInputDialog("Ingresa tu peso en kilogramos:"));
            float estatura = Float.parseFloat(JOptionPane.showInputDialog("Ingresa tu estatura en metros:"));
            float imc = peso / (estatura * estatura);
            JOptionPane.showMessageDialog(null, "Tu índice de masa corporal es: " + imc);
            if (imc < 18.5) {
                System.out.println("PESO BAJO");
            } else if (imc >= 18.5 && imc <= 24.99) {
                System.out.println("PESO NORMAL");
            } else if (imc >= 25 && imc <= 29.99) {
                System.out.println("SOBREPESO");
            } else if (imc >= 30 && imc <= 34.99) {
                System.out.println("OBESIDAD GRADO 1");
            } else if (imc >= 35 && imc <= 39.99) {
                System.out.println("OBESIDAD GRADO 2");
            } else {
                System.out.println("OBESIDAD MÓRBIDA");
            }
        }
    }
}
import javax.swing.JOptionPane;
public class Ejercicio5 {
    public static void main(String[] args) {
        // Leer el radio y la altura
        double radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio del cilindro: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura del cilindro: "));

        // Constante para el valor de pi
        double pi = Math.PI;

        // Calcular el área lateral
        double areaLateral = 2 * pi * radio * altura;

        // Calcular el área total
        double areaTotal = 2 * pi * radio * (radio + altura);

        // Calcular el volumen
        double volumen = pi * Math.pow(radio, 2) * altura;

        // Mostrar los resultados
        JOptionPane.showMessageDialog(null, "Área lateral: " + areaLateral + 
                                      "\nÁrea total: " + areaTotal + 
                                      "\nVolumen: " + volumen);
    }
}

    


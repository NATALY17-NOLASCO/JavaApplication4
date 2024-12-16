import javax.swing.JOptionPane;

public class CicloWhile {
    public static void main(String[] args) {
        byte x, num, resp = 1;
        int fact;
        
        do {
            fact = 1;
            num = Byte.parseByte(JOptionPane.showInputDialog("Captura un numero"));
            x = num;
            while (x >= 1) {
                fact *= x; 
                System.out.print(fact + " \t ");
                x--;  
            }           
            System.out.println(" El factorial de " + num + " es: " + fact);
            resp = Byte.parseByte(JOptionPane.showInputDialog("Presiona 1 para realizar otro cálculo "));
            
        } while (resp == 1);
    }
}

import javax.swing.JOptionPane;

public class CicloFor {
    public static void main(String[] NAT) {
        byte num, resp, x;
        int fact;
        
        do {
            num = Byte.parseByte(JOptionPane.showInputDialog("Ingresa un numero"));
            fact = 1;
            for (x = num; x >= 1; x--) {
                fact *= x;
            }
            System.out.println("El factorial de " + num + " es: " + fact);
            resp = Byte.parseByte(JOptionPane.showInputDialog("Presiona 1 para continuar"));
            
        } while (resp == 1); 
    }
}

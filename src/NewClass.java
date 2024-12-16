import javax.swing.JOptionPane;
public class NewClass {
    public static void main (String [] args){
        byte x, num,resp=1;      
        int fact;           
        do{
            
            fact=1;
            // calculo del factorial
            num=Byte.parseByte (JOptionPane.showInputDialog("Captura un numero"));
        
        for(x=num;x>=1;x--){
            
            fact*=x;
            System.out.print(fact + " \t ");
        } // cierra for
        System.out.println(" el factorial de " + num + " es: " + fact);
        resp=Byte.parseByte(JOptionPane.showInputDialog("presiona 1 para realizar otro calculo "));
        
        }while (resp==1); 
        
    } // cierra metodo principal 
} // cierra clase 

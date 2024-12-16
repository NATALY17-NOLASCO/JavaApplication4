import javax.swing.JOptionPane;
public class Materias {
    public static void main (String[]args){
        String[] materias={"MaDiscretas", "CalculoDife", "Fundamentos","CalculoInte ", "Programacio"};
        String[] unidades={"Unidad 1", "Unidad 2","Unidad 3","Unidad 4","Unidad 5"};
        int [][] calificaciones = new int [5][5];
        
        for (int i=0; i<materias.length; i++){
            System.out.println("Calificacion de " + materias[i]);
            for (int j=0; j<unidades.length; j++){
                calificaciones[i][j]= Integer.parseInt(JOptionPane.showInputDialog("Calificacion de " + unidades [j]));
            }
    }
        
        System.out.println("Materia U1-----U2-----U3-----U4-----U5-----Final");
        for (int i=0; i<materias.length; i++){
            System.out.print(materias[i] + ": \t");
            double suma=0;
            for (int j=0; j<unidades.length; j++){
                 System.out.print(calificaciones [i][j] + "\t");
                 suma+= calificaciones [i][j];
            }
            double promedio= suma/unidades.length;
            System.out.println(" " + promedio);   
        }
    } 
}
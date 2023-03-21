//Ler as notas de 5 alunos, calcular e exibir suas medias.
import javax.swing.JOptionPane;

public class MediaCincoAlunos {
    public static void main(String [] args){

        int cont = 1;
        
        while(cont <= 5){
            double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1: "));
            double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2: "));

            JOptionPane.showMessageDialog(null,"Sua media: " + (n1+n2)/2);
            cont = cont + 1;
        }
    }
}
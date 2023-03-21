//Ler 2 inteiros e verificar se o 1º é divisivel pelo 2º
import javax.swing.JOptionPane;

public class Exercicio{
    public static void main (String[] args){
        //declaração de variaveis
        int n1, n2;

        //entrada de dados
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero: "));

        //processamento e saída
        if(n1%n2 == 0){
            JOptionPane.showMessageDialog(null, n1 +" e divisivel por "+ n2);
        }else{
            JOptionPane.showMessageDialog(null, n1 +" nao e divisivel por "+ n2);
            
        }
    }
}
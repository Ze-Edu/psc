//ler a idade do usuario e ver se ele pode dirigir 
import javax.swing.JOptionPane;

public class Ex2 {
    public static void main(String [] args){

        //declaração de variaveis
        int idade;
        String podeDirigir;

        //processamento
        idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade: "));

        if(idade >= 18){
            podeDirigir = "Voce pode dirigir";
        }else{
            podeDirigir = "Voce nao pode dirigir";
        }
        //saida

        JOptionPane.showMessageDialog(null,"Com a sua idade de "+ idade +" anos, "+ podeDirigir);

    }
}
import javax.swing.JOptionPane;
//Ler um inteiro e verificar se ele é primo

public class Primos {
    public static void main(String[] args){
        //Declaração de variaveis
        int num;

        //Entrada e verificação
        do{
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero acima de 0: "));
        }while(num <= 0);
        
        //Processamento
        int div = 1;
        int cont = 0;

        while(div <= num){
            if(num % div == 0){
                cont++;
            }
            div++;
        }
        if(cont == 2){
            JOptionPane.showMessageDialog(null, num + " e primo");
        }else{
            JOptionPane.showMessageDialog(null, num + " nao e primo");

        }
    }
}

import javax.swing.JOptionPane;

public class Divisores{
    public static void main(String[] args){
        
        int num;
        String msg = "";

        do{

            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero positivo: "));
        
        }while(num <= 0);

        for(int i=1; i<=num; i++){
            if(num % i == 0){
                msg  = msg + i + ", ";
            }
        }
        JOptionPane.showMessageDialog(null, msg + "Sao os divisores de: "+ num);
    }
}
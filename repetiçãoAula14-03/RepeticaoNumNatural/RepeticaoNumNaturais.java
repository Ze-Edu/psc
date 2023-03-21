import javax.swing.JOptionPane;

public class RepeticaoNumNaturais {
    public static void main(String [] args){

        int cont = 100;
        //int soma = 0;
        String msg = "";

        while(cont > 0){
            //soma = soma +1;
            //JOptionPane.showMessageDialog(null,"Contagem: "+ soma);
            msg = msg + cont + " ";
            cont = cont-1;
        }
        //fora do laço
        JOptionPane.showMessageDialog(null,msg);
    }
}
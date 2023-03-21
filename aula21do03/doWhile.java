import java.util.Scanner;
import javax.swing.JOptionPane;

public class doWhile{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int paraContinua;
        int cont = 1;

        do{
            System.out.println(cont + " ");
            System.out.println("Digite 1 para continuar ou outro numero para parar: ");
            paraContinua = scanner.nextInt();
            cont++;
        }while(paraContinua == 1);

        System.out.println("Fim execucao!");
    }
}
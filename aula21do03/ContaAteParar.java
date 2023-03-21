//Fazer contagem até usuário mandar parar
//sentinela: 0 para, 1 copntinua

import java.util.Scanner;

public class ContaAteParar{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int cont = 1;
        int paraContinua = 1;

        System.out.println("Vou comecar a contar...");

        while(paraContinua == 1){
        System.out.println(cont);
        System.out.println("Digite 0 para parar ou 1 para continuar: ");
        paraContinua = scanner.nextInt();
        cont++;
        }
        scanner.close();
    }
}
import java.util.Scanner;
import java.util.Random;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random inputR = new Random();

        int palpite, numeroCerto, tentativas;
        char continuar;

        do{
            numeroCerto = inputR.nextInt(100) + 1;
            tentativas = 1;

            System.out.println("Bem-vindo ao Jogo de Adivinhação! Estou pensando em um número entre 1 e 100... Tente adivinhar qual é!");

            while (true){
                palpite = input.nextInt();


                if (palpite < numeroCerto){
                    System.out.println("Muito baixo!");
                } else if (palpite > numeroCerto){
                    System.out.println("Muito alto!");
                } else{
                    System.out.println("Você ganhou!");
                    System.out.println("Em " + tentativas + " tentativas.");
                    break;
                }
                tentativas ++;
            }
            System.out.println("Deseja continuar? (s/n)");
            continuar = input.next().charAt(0);
        
        }while (continuar == 's' || continuar == 'S');

        System.out.println("Obrigado por jogar! ");
        input.close();
    }
}
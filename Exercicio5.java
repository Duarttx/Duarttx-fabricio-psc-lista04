import java.util.Scanner;
import java.util.Random;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random inputR = new Random();

        int palpite, numeroCerto, tentativas;

        numeroCerto = inputR.nextInt(100) + 1;
        tentativas = 1;

        System.out.println("Bem-vindo ao Jogo de Adivinhação! Estou pensando em um número entre 1 e 100... Tente adivinhar qual é!");

        while (true){
            palpite = input.nextInt();


            if (palpite < numeroCerto){
                System.out.println("Muito baixo!");
            } else if (palpite > numeroCerto){
                System.out.println("Muito alto!");
            } else {
                System.out.println("Parabéns você acertou!");
                break;
            }
            tentativas ++;
        }
        System.out.println("Em " + tentativas + " tentativas.");
        input.close();
    }
}
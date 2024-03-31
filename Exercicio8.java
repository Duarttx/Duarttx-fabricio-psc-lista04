import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2, resultado;

        resultado = 0;

        System.out.println("Digite o primeiro fator na multiplicação: ");
        num1 = input.nextDouble();

        System.out.println("Digite o segundo fator na multiplicação: ");
        num2 = input.nextDouble();

        for (int i = 0; i < num2; i++){
            resultado += num1;
        }

        System.out.println("O resultado da multiplicação é: " + resultado);

        input.close();
    }
}

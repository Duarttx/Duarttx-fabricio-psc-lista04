import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double massa, massaFinal, tempoSegundos, tempo;

        massaFinal = 0.10;

        System.out.println("Digite a massa do objeto em gramas: ");
        massa = input.nextDouble();

        for (tempo = 0; massa >= massaFinal; tempo++){
            massa *= 0.75;
        }
        tempoSegundos = tempo * 30;
        System.out.println("O tempo necessário para a massa ser reduzida até ser menor que 0.10 gramas foi: " + tempoSegundos);

        input.close();
    }
}
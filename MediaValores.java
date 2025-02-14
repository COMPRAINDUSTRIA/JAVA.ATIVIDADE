import java.util.Scanner;

public class MediaValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] valores = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            valores[i] = scanner.nextDouble();
        }

        double soma = 0;
        for (double valor : valores) {
            soma += valor;
        }
        double media = soma / 5;

        System.out.printf("Média: %.2f%n", media);
        System.out.print("Valores acima da média: ");
        for (double valor : valores) {
            if (valor > media) {
                System.out.print(valor + " ");
            }
        }

        scanner.close();
    }
}

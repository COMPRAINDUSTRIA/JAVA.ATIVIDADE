import java.util.Scanner;

public class parouímpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de dedos do jogador 1: ");
        int dedosJogador1 = scanner.nextInt();

        System.out.print("Digite o número de dedos do jogador 2: ");
        int dedosJogador2 = scanner.nextInt();

        int totalDedos = dedosJogador1 + dedosJogador2;

        if (totalDedos % 2 == 0) {
            System.out.println("O resultado é par");
        } else {
            System.out.println("O resultado é ímpar");
        }

        scanner.close();
    }
}

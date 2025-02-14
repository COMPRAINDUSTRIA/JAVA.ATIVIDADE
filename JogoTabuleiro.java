import java.util.Scanner;

public class JogoTabuleiro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do dado do jogador: ");
        int dadoJogador = scanner.nextInt();

        System.out.print("Digite o número do dado do adversário: ");
        int dadoAdversario = scanner.nextInt();

        if (dadoJogador > dadoAdversario) {
            System.out.println("Jogador pode jogar");
        } else if (dadoJogador < dadoAdversario) {
            System.out.println("Adversário pode jogar");
        } else {
            System.out.println("Nenhum dos jogadores joga");
        }

        scanner.close();
    }
}

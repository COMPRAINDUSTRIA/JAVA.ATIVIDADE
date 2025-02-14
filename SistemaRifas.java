import java.util.Random;
import java.util.Scanner;

public class SistemaRifas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Digite o número máximo da rifa: ");
        int maxRifa = scanner.nextInt();

        System.out.print("Digite o número da rifa apostado: ");
        int rifaUsuario = scanner.nextInt();

        int rifaSorteada = random.nextInt(maxRifa) + 1;

        if (rifaUsuario == rifaSorteada) {
            System.out.println("Parabéns! Você ganhou. O número sorteado foi " + rifaSorteada);
        } else {
            System.out.println("Que pena! Você não ganhou. O número sorteado foi " + rifaSorteada);
        }

        scanner.close();
    }
}

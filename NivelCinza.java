import java.util.Scanner;

public class NivelCinza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nível de cinza (0-255): ");
        int nivelCinza = scanner.nextInt();

        if (nivelCinza < 0 || nivelCinza > 255) {
            System.out.println("Valor inválido");
        } else if (nivelCinza < 128) {
            System.out.println("Tom escuro");
        } else {
            System.out.println("Tom claro");
        }

        scanner.close();
    }
}

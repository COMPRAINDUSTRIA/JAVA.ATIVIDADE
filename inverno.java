import java.util.Scanner;
public class inverno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura atual: ");
        double temperatura = scanner.nextDouble();

        if (temperatura < 17) {
            System.out.println("Frio do diachoo");
        } else {
            System.out.println("Tudo normal aqui em Feira City");
        }

        scanner.close();
    }
}

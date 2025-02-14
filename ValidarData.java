import java.util.Scanner;

public class ValidarData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia: ");
        int dia = scanner.nextInt();

        System.out.print("Digite o mês: ");
        int mes = scanner.nextInt();

        System.out.print("Digite o ano: ");
        int ano = scanner.nextInt();

        if (dataValida(dia, mes, ano)) {
            System.out.println("A data é válida");
        } else {
            System.out.println("A data não é válida");
        }

        scanner.close();
    }

    public static boolean dataValida(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) return false;

        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (mes == 2 && ehBissexto(ano)) {
            diasPorMes[2] = 29;
        }

        return dia > 0 && dia <= diasPorMes[mes];
    }

    public static boolean ehBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
}

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Digite N: ");
        int n = sc.nextInt();
        double soma = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o valor " + i + ": ");
            soma += sc.nextDouble();
        }
        System.out.printf("%.2f%n", soma / n);
        sc.close();
    }
}

import java.util.Locale;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Digite o primeiro valor: ");
        double a = sc.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double b = sc.nextDouble();
        System.out.print("Digite o terceiro valor: ");
        double c = sc.nextDouble();

        if (a > 0 && b > 0 && c > 0 && a < b + c && b < a + c && c < a + b) {
            System.out.println("Forma triângulo");
        } else {
            System.out.println("Não forma triângulo");
        }
        sc.close();
    }
}

import java.util.Locale;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Digite o primeiro lado: ");
        double a = sc.nextDouble();
        System.out.print("Digite o segundo lado: ");
        double b = sc.nextDouble();
        System.out.print("Digite o terceiro lado: ");
        double c = sc.nextDouble();

        boolean valido = a > 0 && b > 0 && c > 0
                && a < b + c && b < a + c && c < a + b;

        if (!valido) {
            System.out.println("Não forma triângulo");
        } else if (a == b && b == c) {
            System.out.println("Triângulo Equilátero");
        } else if (a == b || a == c || b == c) {
            System.out.println("Triângulo Isósceles");
        } else {
            System.out.println("Triângulo Escaleno");
        }
        sc.close();
    }
}

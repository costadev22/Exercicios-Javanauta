import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite N: ");
        int n = sc.nextInt();
        boolean primo = true;

        if (n < 2) {
            primo = false;
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    primo = false;
                    break;
                }
            }
        }
        System.out.println(primo ? "Primo" : "Não primo");
        sc.close();
    }
}
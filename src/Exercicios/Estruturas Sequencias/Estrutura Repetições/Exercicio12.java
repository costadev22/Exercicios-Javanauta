import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite N: ");
        int n = sc.nextInt();
        int maior = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o valor " + i + ": ");
            int v = sc.nextInt();
            if (v > maior) {
                maior = v;
            }
        }
        System.out.println(maior);
        sc.close();
    }
}
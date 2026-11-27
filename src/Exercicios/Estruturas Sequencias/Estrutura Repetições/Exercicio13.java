import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = sc.nextInt();
        int soma = 0;

        while (n > 0) {
            soma += n % 10;
            n /= 10;
        }
        System.out.println(soma);
        sc.close();
    }
}
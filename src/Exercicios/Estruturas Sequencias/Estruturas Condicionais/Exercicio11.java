import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = sc.nextInt();

        if (n > 0 && n % 2 == 0) {
            System.out.println("O número é positivo e par");
        } else if (n > 0) {
            System.out.println("O número é positivo, mas não é par");
        } else {
            System.out.println("O número não é positivo");
        }
        sc.close();
    }
}

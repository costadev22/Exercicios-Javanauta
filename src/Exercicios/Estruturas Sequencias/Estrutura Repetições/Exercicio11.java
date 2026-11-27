import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a base B: ");
        int n = sc.nextInt();
        System.out.print("Digite o expoente E: ");
        int e = sc.nextInt();
        long pot = 1;

        for (int i = 1; i <= e; i++) {
            pot *= n;
        }
        System.out.println(pot);
        sc.close();
    }
}
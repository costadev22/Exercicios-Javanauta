import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Digite o valor da compra: R$ ");
        double valor = sc.nextDouble();
        double novoValor;

        if (valor > 100.00) {
            novoValor = valor * 0.90;   // 10% de desconto
        } else if (valor >= 50.00) {
            novoValor = valor * 0.95;   // 5% de desconto
        } else {
            novoValor = valor;          // sem desconto
        }

        System.out.printf("Novo valor: R$ %.2f%n", novoValor);
        sc.close();
    }
}

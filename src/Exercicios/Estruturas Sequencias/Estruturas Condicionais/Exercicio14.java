import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a idade do atleta: ");
        int idade = sc.nextInt();

        if (idade < 0) {
            System.out.println("Idade inválida");
        } else if (idade <= 13) {
            System.out.println("Categoria Infantil");
        } else if (idade <= 17) {
            System.out.println("Categoria Juvenil");
        } else if (idade <= 35) {
            System.out.println("Categoria Adulto");
        } else {
            System.out.println("Categoria Master");
        }
        sc.close();
    }
}

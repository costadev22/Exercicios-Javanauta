package Exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();

        int diasVividos = 365 * idade;

        System.out.println("Você viveu aproximadamente: " + diasVividos + " dias");
    }
}

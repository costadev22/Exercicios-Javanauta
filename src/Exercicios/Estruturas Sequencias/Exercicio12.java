package Exercicios;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor em real: ");
        double real = scanner.nextDouble();

        System.out.print("Digite a cotação do dolar: ");
        double cot = scanner.nextDouble();

        double dolares = real / cot;
        System.out.printf("%.2f dolares\n", dolares);
    }
}

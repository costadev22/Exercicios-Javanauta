package Exercicios;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de um produto: ");
        double valorProduto = sc.nextDouble();

        System.out.print("Digite o valor da porcentagem de um produto: ");
        double valorPorcentagem = sc.nextDouble();

        double valorFinal = valorProduto - (valorPorcentagem * valorPorcentagem / 100.0);
        System.out.printf("%.2f\n", valorFinal);

    }
}

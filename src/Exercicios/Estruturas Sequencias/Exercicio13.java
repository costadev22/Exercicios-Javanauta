package Exercicios;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salario fixo: ");
        double salarioFixo = sc.nextDouble();

        System.out.print("Digite a comissão de vendas: ");
        double vendas = sc.nextDouble();

        double comissao = vendas * 0.10;
        double finalSal = salarioFixo + comissao;

        System.out.printf("%.2f\n", finalSal);
    }
}

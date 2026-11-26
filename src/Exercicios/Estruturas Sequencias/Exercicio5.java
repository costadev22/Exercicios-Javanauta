package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Digite quanto você ganha por hora: ");
        double quantidadePorHora = sc.nextDouble();

        System.out.print("Digite quantas horas você trabalha: ");
        int quantidadeHorasTrabalhadas = sc.nextInt();

        double salario = quantidadePorHora * quantidadeHorasTrabalhadas;
        System.out.printf("Salário: %.2f%n", salario);

        sc.close();
    }
}
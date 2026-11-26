package Exercicios;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor(metros): ");
        double metros = sc.nextDouble();

        double conversao = metros * 100;

        System.out.println("Conversão de metros para centimetos: " + conversao);
    }
}

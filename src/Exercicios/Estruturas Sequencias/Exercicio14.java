package Exercicios;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        double peso = sc.nextDouble();

        System.out.print("Digite sua altura: ");
        double altura = sc.nextFloat();

        double imc = peso / (altura * altura);

        System.out.printf("Seu Imc é: %.2f\n ", imc);


    }
}

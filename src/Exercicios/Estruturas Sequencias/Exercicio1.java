package Exercicios;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n1 = sc.nextInt();

        System.out.print("Digite outro numero: ");
        int n2 = sc.nextInt();

        int soma = n1 + n2;

        System.out.println("A soma dos numeros: " + soma);
    }
}

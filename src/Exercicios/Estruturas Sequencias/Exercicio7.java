package Exercicios;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da base: ");
        int valorBase = sc.nextInt();

        System.out.println("Digite o valor da altura: ");
        int valorAltura = sc.nextInt();

        int area = valorBase * valorAltura;

        System.out.println("O valor da area do triangulo: " + area);

    }
}

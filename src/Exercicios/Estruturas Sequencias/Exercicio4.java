package Exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        double c = sc.nextDouble();

        double f = (c * 9.0 / 5.0) + 32;

        System.out.printf("%.2f\n", f);
    }
}

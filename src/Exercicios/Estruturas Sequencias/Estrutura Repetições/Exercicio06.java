package Exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n = sc.nextInt();

        int cont = 0;

        do {
            n /= 10;
            cont++;
        } while(n > 0);

        System.out.println(cont);

    }
}

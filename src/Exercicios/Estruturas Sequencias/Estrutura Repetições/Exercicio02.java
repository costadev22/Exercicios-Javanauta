package Exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n = sc.nextInt();

        int soma = 0;

        for(int i = 0; i < n; i++){
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int numero = sc.nextInt();
            soma += numero;
        }

        System.out.println(soma);
        sc.close();
    }
}

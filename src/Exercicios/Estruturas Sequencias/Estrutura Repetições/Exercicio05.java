package Exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n = sc.nextInt();

        long fat = 1;

        for(int i = 1; i <= n; i++){
            fat += i;
        }

        System.out.println(fat);
    }
}

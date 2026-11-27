package Exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();

        for(int i = 0; i <= numero; i += 2){
            System.out.println(i);
        }
    }
}

package Exercicios;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int numero = sc.nextInt();

        int numeroSucessor = numero + 1;
        int numeroAntecessor = numero - 1;

        System.out.println("Numero Sucessor: " + numeroSucessor);
        System.out.println("Numero Antecessor: " + numeroAntecessor);
    }
}

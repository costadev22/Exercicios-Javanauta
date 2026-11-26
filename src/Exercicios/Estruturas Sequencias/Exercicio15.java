package Exercicios;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma distancia: ");
        double distancia = sc.nextDouble();

        System.out.print("Digite o tempo: ");
        double tempo = sc.nextDouble();

        double vel = distancia / tempo;
        System.out.printf("A velocidade media e de: %.2f km/hr\n", vel);
    }
}

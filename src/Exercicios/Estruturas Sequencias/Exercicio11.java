package Exercicios;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a percorrida em (km): ");
        double distanciaKM = sc.nextDouble();

        System.out.print("Digite quantos litros: ");
        double litrosGastos = sc.nextDouble();

        double consumo = distanciaKM / litrosGastos;

        System.out.printf("%.2f km/l\n", consumo);
    }
}

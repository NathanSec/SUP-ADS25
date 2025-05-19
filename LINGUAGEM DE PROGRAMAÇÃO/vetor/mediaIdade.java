package com.mycompany.vetor;
import java.util.Scanner;
public class mediaIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5, soma = 0;
        double media;
        int idade[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Digite a idade da %dº pessoa de %d: ",(i+1),n);
            idade[i] = sc.nextInt();
        }
        for (int value : idade) {
            soma += value;
        }
        media = soma/n;
        System.out.println("\nA média das 5 idades fornecidas é: ");
        System.out.println("Média: "+media);
    }
}

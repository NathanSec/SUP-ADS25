package com.mycompany.vetor;
import java.util.Scanner;
public class vetor2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = 3;
        int vetor[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Informe o %dº valor de %d: ",(i+1), n);
            vetor[i] = ler.nextInt();
        }
        for (int j = 0; j < n; j++) {
            System.out.println("Vetor["+j+"] = " + vetor[j]);
        }
    }
}

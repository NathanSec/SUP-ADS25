package com.mycompany.matriz;

import java.util.Scanner;


public class desafioMatriz {
    public static void main(String[] args) {
        int num[][] = new int [2][2];
        int i,j;
        Scanner ler = new Scanner(System.in);
        int total = 0;
        int somaLinhas;
        for (i = 0; i < 2; i++){
            somaLinhas = 0;
            for(j = 0; j <2; j++){
                System.out.printf("Digite o valor:");
                num[i][j] = ler.nextInt();
                somaLinhas = somaLinhas + num[i][j];
            }
            System.out.println("A soma da linha "+i+" é = "+somaLinhas);
            total += somaLinhas;
        }
        System.out.printf("A soma total é =  %2d\n", total);
    }
}

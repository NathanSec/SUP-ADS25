package com.mycompany.vetor;

import java.util.Scanner;

public class intercalaVetor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int A[] = new int[5];
        int B[] = new int[5];
        int C[] = new int[10];
        System.out.println("Digite 5 números para guardar no vetor:");
        for (i = 0; i < 5; i++) {
            A[i] = sc.nextInt();
        }
        for (i = 0; i < 5; i++) {
            B[i] = sc.nextInt();
        }
        for (int j = 0; j < 10; j++) {
            for (i = 0; i < 5; i++) {
                if (j % 2 == 0) {
                    C[j] = A[i];
                }else{
                    C[j] = B[i];
                }
                
            }
        }
        for(int k = 0; k <10; k++){
            System.out.println("C["+k+"] = "+C[k]);
        }
    }
}

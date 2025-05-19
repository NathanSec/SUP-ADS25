package com.mycompany.vetor;
import java.util.Scanner;
public class armazenarVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int A[] = new int[5];
        int B[] = new int[5];
        System.out.println("Digite 5 números para guardar no vetor:");
        for (i = 0; i < 5; i++) {
            A[i] = sc.nextInt();
            B[i]=2*A[i];
        }
        System.out.println("Os números de A*2 copiados para B foram: ");
        for (i = 0; i < 5; i++){
            System.out.println("B["+i+"] = "+B[i]);
        }
        
    }
}

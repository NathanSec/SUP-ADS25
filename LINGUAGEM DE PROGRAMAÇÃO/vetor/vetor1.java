package com.mycompany.vetor;
public class vetor1 {
    public static void main(String[] args) {
        int i, n = 10; // indice ou posiçãov
        int vetor1[] = new int [10];
        for (i = 0; i < n; i++){
            vetor1[i] = i;
            System.out.println("Vetor["+ i +"] = " + vetor1[i]);
        }
    }
}

package com.mycompany.lacorepeticao;
import java.util.Scanner;

public class somaimpares {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int i =0;
        
        System.out.println("Quantos números deseja informar?");
        int totalNumeros = sc.nextInt();
        
        
        while (i != totalNumeros){
            System.out.println("Digite um número: ");
            int num = sc.nextInt();
            
            if(num % 2 != 0){
                total +=num;
            }
            totalNumeros--;
        }
        System.out.println("soma dos ímpares: "+total);
    }
}

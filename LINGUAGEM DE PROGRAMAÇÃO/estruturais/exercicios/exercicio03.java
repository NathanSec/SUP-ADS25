package com.mycompany.estruturascondicionais;

import java.util.Scanner;

public class exercicio03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inteiro1, inteiro2;
        
        System.out.println("Digite o primeiro número: ");
        inteiro1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        inteiro2 = sc.nextInt();
        

        if(inteiro1>=inteiro2){
            int diferenca = inteiro1 - inteiro2;
            System.out.println("A diferença de "+inteiro1+" e "+inteiro2+" é: "+diferenca);
        }
        else{
           int diferenca = inteiro2 - inteiro1;
           System.out.println("A diferença de "+inteiro2+" e "+inteiro1+" é: "+diferenca);
        
        }
        
        
    }
}

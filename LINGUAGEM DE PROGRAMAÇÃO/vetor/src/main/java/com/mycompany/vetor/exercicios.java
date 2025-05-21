package com.mycompany.vetor;
import java.util.Scanner;
public class exercicios {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        /*
        
        int n;
        n = sc.nextInt();
        if(n>0){
            System.out.println("Maior que 0");
        }else if(n==0){
            System.out.println("Zero!");
        }
        else{
            System.out.println("Menor que 0");
        }
        
        double n1,n2, sub, div;
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        
        sub = n1 - n2;
        div = n1/n2;
        System.out.println("Divisão = "+div);
        System.out.println("Subtração = "+sub);
        */
        
        int n;
        n = sc.nextInt();
        
        if(n%2==0){
            System.out.println("Par");
        }else{
            System.out.println("Ímpar");
        }
        
        double numeroPensado = Math.random() * 100;
        System.out.println("Qual acha que é?");
        double chute = sc.nextDouble();
        if(chute == numeroPensado){
            System.out.println("Acertou: "+numeroPensado);
        
            }else{
            System.out.println("Errou");
        }
        
    }
}

package com.mycompany.exfixacao;
import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        int soma = 0, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor inicial: ");
        int x = sc.nextInt();
        System.out.println("Digite um valor final: ");
        int y = sc.nextInt();
        for (i=x; i <= y; i++){
        soma = soma + i;
        }
        System.out.println("Soma de x a y = "+soma);
    }
}
package com.mycompany.switchcase;

import java.util.Scanner;

public class calcChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char sinal;
        float n1, n2, resultado = 0;
        System.out.println("*** Calculadora ***");
        System.out.println("Digite dois números: ");
        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        System.out.println("+ Somar\n - Subtrair\n * Multiplicar\n / Dividir");
        sinal = sc.next().charAt(0);
        switch (sinal) {
            case '+':
                resultado = n1 + n2;
                break;
            case '-':
                resultado = n1 - n2;
                break;
            case '*':
                resultado = n1 * n2;
                break;
            case '/':
                resultado = n1 / n2;
                break;
        }
        System.out.println("resultado = "+ resultado);

    }
}

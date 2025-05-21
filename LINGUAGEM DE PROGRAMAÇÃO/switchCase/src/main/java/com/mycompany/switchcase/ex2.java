package com.mycompany.switchcase;
import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1,num2,resultado = 0;
        char operador;
        
        System.out.println("Digite o 1° número: ");
        num1 = sc.nextInt();
        System.out.println("Digite o 2° número: ");
        num2 = sc.nextInt();
        
        System.out.println("Escolha a Operação: ");
        operador = sc.next().charAt(0);
        
        switch (operador){
            case 'M':
                resultado = (num1+num2)/2;
                break;
            case 'S':
                if(num1 > num2){
                    resultado = num1 - num2;
                }   else{
                    resultado = num2 - num1;
                }
                break;
            case 'P':
                resultado = num1*num2;
                break;
            case 'D':
                resultado = num1/num2;
                break;     
            default:
                System.out.println("Numero invalido");
                break;
        }
        System.out.println("O resultado é: "+resultado);
        
       
    }
}

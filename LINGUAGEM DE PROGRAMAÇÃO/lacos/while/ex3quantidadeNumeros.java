package com.mycompany.lacorepeticao;
import java.util.Scanner;
public class ex3quantidadeNumeros {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0,totalNums = 0, totalCincos = 0;

        while (num != -1) {
            System.out.println("Digite um número: ");
            num = sc.nextInt();
            if(num != -1){
                totalNums++;
            }
            if (num == 5) {
                totalCincos++;
            }
            if (num == -1) {
                System.out.println("Total de números digitados: " + totalNums);
                System.out.println("Total de cincos digitados: " + totalCincos);
                break;
                
            }
        }
    }
}

package com.mycompany.exfixacao;

import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, n, i, f = 0;

        System.out.println("Digite um valor inicial: ");
        x = sc.nextInt();
        System.out.println("Digite um valor final: ");
        n = sc.nextInt();

        for (int primo = x; primo < n; primo++) {

            for (i = 2; i < primo; i++) {
                if (primo % i == 0) {
                    f = 1;
                    break;
                }else{
                    f = 0;
    
                }
               if(f==0){
                    System.out.println(primo + " ");
               }
               break;
            }
        }
    }
}

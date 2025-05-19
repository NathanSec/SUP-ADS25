package com.mycompany.switchcase;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num) {
            case 9:
                System.out.println("\n\nO número é igual a 9.\n");
                break;
            case 10:
                System.out.println("\n\nO número é igual a 10.\n");
                break;
            case 11:
                System.out.println("\n\nO número é igual a 11.\n");
                break;
            default:
                System.out.println("\n\nO número não é nem 9 nem 10 nem 11.\n");
                break;
        }
    }
}

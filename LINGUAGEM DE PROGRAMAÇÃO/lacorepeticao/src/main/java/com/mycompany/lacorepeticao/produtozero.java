package com.mycompany.lacorepeticao;

import java.util.Scanner;

public class produtozero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = 1;
        int i = 1;

        while (i != 0) {

            System.out.println("Digite número para multiplicar: ");
            int num = sc.nextInt();
            i = num;
            total *= num;
            System.out.println("total: "+total);
        }
    }
}

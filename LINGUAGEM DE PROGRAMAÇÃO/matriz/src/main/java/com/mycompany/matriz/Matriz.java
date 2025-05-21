package com.mycompany.matriz;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        int M[][] = new int[2][3];
        int i, j; //i Segue as linhas - j segue as colunas
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite números inteiros: ");
        for(i=0;i<2;i++){
            for(j=0;j<3;j++){
                M[i][j]= sc.nextInt();
            }

        }
        for(i=0;i<2;i++){
            for(j=0;j<3;j++){
                System.out.print(M[i][j]+";");
            }
            System.out.println("");
        }
    }
}

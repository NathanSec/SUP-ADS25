package com.mycompany.exfixacao;
import java.util.Scanner;
public class elevado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        for(int j = 1; j!=n+1; j++){
                System.out.println(j+" "+(j*j)+" "+(j*j*j));
        }
    }
}

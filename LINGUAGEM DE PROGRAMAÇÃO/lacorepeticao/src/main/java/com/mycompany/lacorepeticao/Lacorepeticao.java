package com.mycompany.lacorepeticao;
import java.util.Scanner;
public class Lacorepeticao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while (num == 0){
             System.out.println("java é pera pra quem quiser aprender");
             System.out.println("Digite 0 para repetir e 1 para parar");
             num = sc.nextInt();
        }
    }
}

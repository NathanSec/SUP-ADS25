package aula1.beetb;

import java.util.Scanner;


public class BeeTB {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c,mab,mad;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        mab = (a+b+Math.abs(a-b))/2;
        mad = (c+mab+Math.abs(c-mab))/2;
        
        System.out.println(mad+" eh o maior");
    }
}

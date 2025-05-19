package aula1.beetb;

import java.util.Scanner;

public class CircleArea {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double pi, A, R;
        pi = 3.14159;
        R = sc.nextDouble();
        
        A = pi*(R*R);
        
        System.out.printf("A=%.4f\n",A);
        
       
        
        
        
    }
    
    
    
}

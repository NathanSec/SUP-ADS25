package aula1.beetb;

import java.util.Scanner;

public class SimpleCalculate {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int c1,n1,c2,n2;
    double v1,v2,valuetopay;
    
    c1 = sc.nextInt();
    n1 = sc.nextInt();
    v1 = sc.nextDouble();
    c2 = sc.nextInt();
    n2 = sc.nextInt();
    v2 = sc.nextDouble();
    
    valuetopay = (n1* v1) + (n2 *v2);
    
    System.out.printf("VALOR A PAGAR: R$ %.2f\n",valuetopay);
    
    }
    
   
}

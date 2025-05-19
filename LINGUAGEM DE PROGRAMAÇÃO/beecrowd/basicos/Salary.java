package aula1.beetb;

import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            int number,hours;
            double hourValue,salary;
            
            number = sc.nextInt();
            hours = sc.nextInt();
            hourValue = sc.nextDouble();
            
            salary = hours*hourValue;
            
            System.out.println("NUMBER = "+number);
            System.out.printf("SALARY = U$ %.2f\n",salary);
    }
}

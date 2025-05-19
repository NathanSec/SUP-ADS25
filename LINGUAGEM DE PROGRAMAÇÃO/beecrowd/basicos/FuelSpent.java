package aula1.beetb;
import java.util.Scanner;
public class FuelSpent {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double hours, speed;
        
        hours = sc.nextDouble();
        speed = sc.nextDouble();
        
        double spent = (hours*speed)/12;
        
        System.out.printf("%.3f\n",spent);
    }
    
}

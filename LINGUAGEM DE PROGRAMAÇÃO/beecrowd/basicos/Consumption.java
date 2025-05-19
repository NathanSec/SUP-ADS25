package aula1.beetb;
import java.util.Scanner;
public class Consumption {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int X;
        double Y, consumption;
        
        X = sc.nextInt();
        Y = sc.nextDouble();
        
        consumption = X/Y;
        
        System.out.printf("%.3f\n km/l",consumption);
        
        
        
    }
    
}

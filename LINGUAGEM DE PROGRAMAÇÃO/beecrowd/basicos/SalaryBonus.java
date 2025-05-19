package aula1.beetb;
import java.util.Scanner;
public class SalaryBonus {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        double salary, bonus, total;

        nome = sc.nextLine();
        salary = sc.nextDouble();
        bonus = sc.nextDouble();
 
        total =  salary +(bonus*0.15);
        
        System.out.printf("TOTAL = R$ %.2f\n",total);
        
    }
    
    
    
 
    
    

   
}

import java.util.Scanner;

public class positiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positive = 0, i = 0;
        
        while(i!=6){
            double num = sc.nextDouble();
            if(num>0){
                positive++;
            }
            i++;
        }
        System.out.println(positive+" valores positivos");
        sc.close();
    }
}

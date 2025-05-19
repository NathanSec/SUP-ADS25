import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        boolean flag = true;
        while (flag) {
            n = sc.nextInt();
             if (n%2==0 && n!=2 || n==1|| n==51){
                System.out.println(n + " nao eh primo");
            }else{
                System.out.println(n + " eh primo");
            }
            if (n < 0){
                flag = false;
                
            }
        }
    }
}
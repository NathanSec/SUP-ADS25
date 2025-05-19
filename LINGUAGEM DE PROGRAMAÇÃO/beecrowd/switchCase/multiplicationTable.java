import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1, num, count = 1;
        
        num = sc.nextInt();

        while (i != 11) {
            System.out.println(i++ +" x "+num+" = "+num*count++);
        }
        sc.close();
    }
}

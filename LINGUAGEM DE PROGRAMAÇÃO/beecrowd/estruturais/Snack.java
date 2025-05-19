import java.util.Scanner;
public class Snack {
    
    public static void main(String[] args) {

        int code, amount;
        double price, total;

        Scanner sc = new Scanner(System.in);

        code = sc.nextInt();
        amount = sc.nextInt();

        if (code == 1) {
            price = 4.00;
            total = amount*price;
            System.out.printf("Total: R$ %.2f\n",total);
        }
        if (code == 2) {
            price = 4.50;
            total = amount*price;
            System.out.printf("Total: R$ %.2f\n",total);
        }
        if (code ==3) {
            price = 5.00;
            total = amount*price;
            System.out.printf("Total: R$ %.2f\n",total);
        }
        if (code == 4) {
            price = 2.00;
            total = amount*price;
            System.out.printf("Total: R$ %.2f\n",total);
        }
        if (code == 5) {
            price = 1.50;
            total = amount*price;
            System.out.printf("Total: R$ %.2f\n",total);
        }
    }
}

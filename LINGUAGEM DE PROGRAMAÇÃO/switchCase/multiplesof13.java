import java.util.Scanner;
public class multiplesof13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = 0;
        if (x > y) {
            for (int i = y -1 ; i < x;) {
                i++;
                if (i % 13 != 0) {
                    sum += i;
                }
            }
        } else {
            for (int i = x - 1 ; i < y;) {
                i++;
                if (i % 13 != 0) {
                    sum += i;
                }
            }
        }
        System.out.println(sum);
        
    }
}

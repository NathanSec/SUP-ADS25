import java.util.Scanner;

public class PUM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, count = 1;
        num = sc.nextInt();

        for (int i = 0; i < num ; i++) {
            System.out.println(count + " " + (count+1) + " " + (count+2) +" PUM");
            count += 4;
            
        }
        sc.close();
    }
}
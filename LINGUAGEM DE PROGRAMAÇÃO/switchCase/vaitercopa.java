import java.util.Scanner;
public class vaitercopa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i= 0;
        boolean condition = i == 0;
        while(condition){
            if (!sc.hasNextInt()){
                break;
                
            }
            i = sc.nextInt();
            if (i == 0){
                System.out.println("Vai ter copa!");
            }
            if(i !=0){
                System.out.println("Vai ter duas!");
            }if(i< 0){
                condition = false;
            }
        }
    }
}

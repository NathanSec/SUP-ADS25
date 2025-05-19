
import java.util.Scanner;
public class fixedPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int password = 0;
        while (password != 2002) {
            password = sc.nextInt();
            if (password == 2002) {
                System.out.println("Acesso Permitido");
            } else {
                System.out.println("Senha Invalida");
                
            }
        }
        sc.close();
    }
}

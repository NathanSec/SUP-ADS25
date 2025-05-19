import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int reajuste = 0, salario = 2000;
        char plano = sc.next().charAt(0);
        switch (plano) {
            case 'A':
                reajuste = salario +(salario * (10/100));
                System.out.println(salario);
                break;
            case 'B':
                reajuste += salario * (15/100);
                System.out.println(reajuste);
                break;
            case 'C':
                reajuste += salario * (20/100);
                System.out.println(reajuste);
                break;
            default:
                System.out.println("Plano inválido");
                break;
        }
    }
}

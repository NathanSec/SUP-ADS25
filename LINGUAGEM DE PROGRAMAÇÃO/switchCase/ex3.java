import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.println("Digite um número para retornar o nome do dia: \n");
        num = sc.nextInt();
        
        switch (num) {
            case 1:
                System.out.println("DOMINGO");
                break;
            case 2:
                System.out.println("SEGUNDA-FEIRA");
                break;
            case 3:
                System.out.println("TERCA-FEIRA");
                break;
            case 4:
                System.out.println("QUARTA-FEIRA");
                break;
            case 5:
                System.out.println("QUINTA-FEIRA");
                break;
            case 6:
                System.out.println("SEXTA-FEIRA");
                break;
            case 7:
                System.out.println("SABADO");
                break;
            default:
                System.out.println("Numero Inválido");
                break;
        }
    }
}

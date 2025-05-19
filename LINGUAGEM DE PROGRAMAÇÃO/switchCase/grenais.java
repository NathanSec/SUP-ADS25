import java.util.Scanner;

public class grenais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int golsInter = 0, golsGremio = 0, grenais = 0, empates = 0, vitoriaInter = 0, vitoriaGremio = 0;
        while (true) {
            grenais++;
            golsInter = sc.nextInt();
            golsGremio = sc.nextInt();
            if (golsInter > golsGremio) {
                vitoriaInter++;
            } else if (golsGremio > golsInter) {
                vitoriaGremio++;
            } else {
                empates++;
            }
            System.out.println("Novo grenal (1-sim 2-nao)");
            int novo = sc.nextInt();
            if (novo == 2) {
                break;
            }
        }
        System.out.println(grenais + " grenais");
        System.out.println("Inter:" + vitoriaInter);
        System.out.println("Gremio:" + vitoriaGremio);
        System.out.println("Empates:" + empates);
        if (vitoriaInter > vitoriaGremio) {
            System.out.println("Inter venceu mais");
        } else if (vitoriaGremio > vitoriaInter) {
            System.out.println("Gremio venceu mais");
        } else {
            System.out.println("Nao houve vencedor");
        }
        
    }
}

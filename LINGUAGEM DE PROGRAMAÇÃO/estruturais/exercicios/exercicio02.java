ppackage com.mycompany.estruturascondicionais;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int number = sc.nextInt();
        if(number %2 == 0 ){
            System.out.println("é par.");
        }
        else{
            System.out.println("é ímpar");
        }
        if(number>=0){
            System.out.println("é positivo.");
        }
        else if(number == 0){
        }
        else{
            System.out.println("é negativo");
        }
    }
}

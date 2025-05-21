package com.mycompany.exfixacao;
import java.util.Scanner;
public class expedienteCoelho {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int expediente, t1, t2;
        System.out.println("Quanto tempo o coelho ainda tem para o expediente de hoje?");
        expediente = sc.nextInt();
        System.out.println("Digite o tempo de produção do 1º ovo: ");
        t1 = sc.nextInt();
        System.out.println("Digite o tempo de produção do 2º ovo: ");
        t2 = sc.nextInt();
        
        if(t1+t2 <= expediente){
            System.out.println("Farei hoje!");
        } else{
            System.out.println("Deixa para amanhã!");
        }      
    }
}

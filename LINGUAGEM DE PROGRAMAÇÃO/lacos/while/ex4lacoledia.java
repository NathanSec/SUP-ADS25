package com.mycompany.lacorepeticao;
import java.util.Scanner;

public class ex4lacoledia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        double nota1, nota2, nota3, soma, media;
        int numBreak = 0;
        while(numBreak >= 0){

            System.out.println("Digite o Nome do Aluno: ");
            String nome = sc1.nextLine();

            System.out.println("Digite a 1º nota:");
            nota1 = sc.nextDouble();
            System.out.println("Digite a 2º nota:");
            nota2 = sc.nextDouble();
            System.out.println("Digite a 3º nota:");
            nota3 = sc.nextDouble();

            if (nota1 < 0 || nota2 < 0 || nota3 < 0){
                numBreak = -1;
                System.out.println("Nota Inválida");
            } else {
                soma = nota1 + nota2 + nota3;
                media = soma / 3;
                System.out.println("");
                System.out.println("*** Calculando a média do aluno ***");
                System.out.println("-Aluno: " + nome);
                System.out.println("-A soma das notas é: " + soma);
                System.out.printf("-A média do aluno é: %.1f\n",media);
                System.out.println("");
            }
        }
        sc.close();
        sc1.close();
    }
}

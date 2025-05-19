package com.mycompany.estruturascondicionais;

import java.util.Scanner;

public class exercicio04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nivel, horas;
        double salario;
        System.out.println(" *** ESCOLA APRENDER ***");
        System.out.println("\nDigite o nome do professor: ");
        String nome = sc.nextLine();
        System.out.println("Digite o nível do professor: ");
        nivel = sc.nextInt();
        System.out.println("Digite as horas de aula: ");
        horas = sc.nextInt();

        if (nivel == 1) {
            salario = horas * 12;
            System.out.println("\nProfessor(a) " + nome);
            System.out.println("Nível: "+nivel);
            System.out.println("Salário: R$ " + salario);
        }if (nivel == 2) {
            salario = horas * 17;
            System.out.println("\nProfessor(a) " + nome);
            System.out.println("Nível: "+nivel);
            System.out.println("Salário: R$ " + salario);
        }if (nivel ==3 ){
            salario = horas * 25;
            System.out.println("\nProfessor(a) " + nome);
            System.out.println("Nível: "+nivel);
            System.out.println("Salário: R$ " + salario);
        }

    }
}

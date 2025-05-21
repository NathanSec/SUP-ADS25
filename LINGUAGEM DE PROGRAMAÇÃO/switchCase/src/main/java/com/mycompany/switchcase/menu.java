package com.mycompany.switchcase;
import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        System.out.println("**** MENU DE OPÇÕES ****");
        System.out.println("1.Cadastrar Peodutos\n");
        System.out.println("2.Listar produtos\n");
        System.out.println("3.Sair do sistema\n");
        menu = sc.nextInt();
        switch(menu) {
            case 1:
                System.out.println("Cadastro do produto\n");
                break;
            case 2:
                System.out.println("Listagem de produtos\n");
                break;
            case 3:
                System.out.println("Adeus");
                break;
            default:
                System.out.println("Item inválido\n");
                break;
                
        }         
    }
}

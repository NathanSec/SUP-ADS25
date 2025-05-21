package com.mycompany.exfixacao;

public class ex3 {
    public static void main(String[] args) {
        int soma = 0, i;
        for (i = 500; i<=2000;i++){
            if(i%4==0){
                soma = soma + i;
            }
        }
        System.out.println("Soma mult de 4 = "+soma);
    }
}

package com.mycompany.cadastropessoa;

public class MinhasPessoas {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Nathan";
        p1.profissao = "Aluno";
        p1.idade = "18";
        
        Pessoa p2 = new Pessoa();
        p2.nome = "Vitor";
        p2.idade = "18";
        
        System.out.println("P1");
        System.out.println(p1.status());
        System.out.println("P2");
        System.out.println(p2.status());
    }
}

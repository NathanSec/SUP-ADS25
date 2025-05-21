package com.mycompany.cadastropessoa;

public class Pessoa {
     String nome, idade, sexo, profissao, receberemail,news ;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getReceberemail() {
        return receberemail;
    }

    public void setReceberemail(String receberemail) {
        this.receberemail = receberemail;
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    public void setCheck(String receberemail) {
        this.receberemail = receberemail;
    }
    
    public String status() {
        return "Nome: " + this.nome +
                "\nIdade: " + this.idade +
                "\nProfissão: " + this.profissao + 
                "\nSexo: " + this.sexo + 
                "\nReceber Email? " + this.receberemail +
                "\nNewsletter? " + this.news +
                "\n"
                ;
    }
}

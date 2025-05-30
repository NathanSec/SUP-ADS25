package com.mycompany.gerenciatarefas;

public class Tarefa {
     String titulo, descricao, categoria, vence ;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getVence() {
        return vence;
    }

    public void setVence(String vence) {
        this.vence = vence;
    }

    
    
    public String status() {
        return "Título: " + this.titulo +
                "\nDescrição: " + this.descricao +
                "\nCategoria: " + this.categoria + 
                "\nVence: " + this.vence + 
                "\n"
                ;
    }
}

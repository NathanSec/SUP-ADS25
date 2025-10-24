package model;

public class Produto implements Imprimivel, Seguranca {
    String descricao;
    int quantidade;

    public Produto(String d, int q){
        this.setDescricao(d);
        this.setQuantidade(q);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String formatoString() {
        return "Descricao: "+this.getDescricao()+nlin+
                "Quantidade: "+this.getQuantidade();
    }

    @Override
    public void formatoSystemOut() {
        System.out.println("Descricao: "+this.getDescricao()+nlin+
                "Quantidade: "+this.getQuantidade());
    }

    @Override
    public boolean validar() {
        if (this.getQuantidade() > 0){
            if (this.getDescricao().length() > 3) {
                return true;
            }
        }
        return false;
    }
}

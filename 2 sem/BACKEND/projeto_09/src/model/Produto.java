package model;

public abstract class Produto {
    private int codigo;
    private String descricao;
    private double valor;


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int argCod) {
        //Aceitar apenas códigos entre 1 e 100000
        if (argCod > 0 && argCod <=100000) {
            this.codigo = argCod;
        }
        else {
            System.out.println("Codigo de produto invalido");
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String argDesc) {
        //Aceitar apenas produtos com nome entre 3 e 10 caracteres
        if (argDesc.length() > 2 && argDesc.length() <= 10){
            this.descricao = argDesc;
        }
        else {
            System.out.println("Descricao invalida");
        }
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double argVlr) {
        //Aeiar apenas valor positivo
        if (argVlr > 0){
            this.valor = argVlr;
        }
        else {
            System.out.println("Valor invalido");
        }
    }

    public String print(){
        String ret;
        ret = "Codigo: "+ this.codigo +
                "\nDescricao: " + this.descricao +
                "\nValor: " + this.valor;
        return ret;
    }

    public abstract void imprimirBoasVindas();
    }
}

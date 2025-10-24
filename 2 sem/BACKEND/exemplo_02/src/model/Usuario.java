package model;

public class Usuario extends Pessoa implements Imprimivel, Seguranca {
    String nomeusuario;
    String senha;


    public Usuario(String nc, int i, String nu, String s) {
        super(nc, i);
        this.setNomeusuario(nu);
        this.setSenha(s);
    }

    public String getNomeusuario() {
        return nomeusuario;
    }

    public void setNomeusuario(String nomeusuario) {
        this.nomeusuario = nomeusuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean validar() {
        if (this.getSenha().length() > 8){
            return  true;
        }
        return false;
    }

    @Override
    public String formatoString() {
        return nlin+"Nome Completo: "+super.getNomecompleto()+nlin+
                "Idade: "+super.getIdade()+nlin+
                "Nome Usuario: "+this.getNomeusuario()+nlin+
                "Senha: "+this.getSenha();
    }

    @Override
    public void formatoSystemOut() {
        System.out.println(nlin+"Nome Completo: "+super.getNomecompleto()+nlin+
                "Idade: "+super.getIdade()+nlin+
                "Nome Usuario: "+this.getNomeusuario()+nlin+
                "Senha: "+this.getSenha());
    }
}

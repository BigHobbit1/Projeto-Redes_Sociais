package br.inatel.cgd.redes;

import javax.security.auth.login.LoginException;

public abstract class RedeSocial {
    protected String senha;
    protected int numAmigos;
    protected String email;

    protected String nomeUsuario;

    public RedeSocial(String senha, int numAmigos, String email, String nomeUsuario) {

        this.senha = senha;

        this.numAmigos = numAmigos;

        this.email = email;

        this.nomeUsuario = nomeUsuario;
    }

    public abstract void postarFoto();

    public abstract void postarVideo();

    public abstract void postarComentario();

    public void curtirPublicacao() {
        System.out.println("Curtindo a publicação...");
    }

    public void realizarLogin(String emailOuUsuario, String senha) throws LoginException {
        if (this.senha.equals(senha)) {
            System.out.println("Logado com sucesso! ");
        } else {
            throw new LoginException("A senha está incorreta! Digite novamente. ");
        }

    }
    public int getNumAmigos() {
        return numAmigos;
    }
    public String getEmail(){
        return email;
    }
    public String getNomeUsuario(){
        return nomeUsuario;
    }

}



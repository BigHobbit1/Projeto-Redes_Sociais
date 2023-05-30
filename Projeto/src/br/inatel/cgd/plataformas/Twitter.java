package br.inatel.cgd.plataformas;
import br.inatel.cgd.redes.Compartilhamento;
import br.inatel.cgd.redes.RedeSocial;

public class Twitter extends RedeSocial implements Compartilhamento {

    public Twitter(String senha, int numAmigos, String email, String nomeUsuario) {

        super(senha, numAmigos, email, nomeUsuario);
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou o conteudo no Twitter....");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Twitter...");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video o Twitter...");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentario no Twitter...");
    }

    @Override
    public void curtirPublicacao(){
        System.out.println("Curtindo a publicação no Twitter...");
    }
}

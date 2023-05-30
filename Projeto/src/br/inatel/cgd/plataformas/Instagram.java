package br.inatel.cgd.plataformas;
import br.inatel.cgd.redes.RedeSocial;

public class Instagram extends RedeSocial{

    public Instagram(String senha, int numAmigos, String email, String nomeUsuario) {

        super(senha, numAmigos, email, nomeUsuario);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Instagram...");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no Instagram....");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentario no Instagram....");
    }

    @Override
    public void curtirPublicacao(){
        System.out.println("Curtindo a publicação no Instagram...");
    }
}

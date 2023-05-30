package br.inatel.cgd.plataformas;
import br.inatel.cgd.redes.Compartilhamento;
import br.inatel.cgd.redes.RedeSocial;
import br.inatel.cgd.redes.VideoConferencia;

public class GooglePlus extends RedeSocial implements VideoConferencia,Compartilhamento{

    public GooglePlus(String senha, int numAmigos, String email, String nomeUsuario) {

        super(senha, numAmigos, email, nomeUsuario);
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhando conteudo no GooglePlus...");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postando foto no GooglePlus...");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postando video no GooglePlus...");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postando um comentario no GooglePlus...");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fazendo Streaming no GooglePlus...");
    }

    @Override
    public void curtirPublicacao(){
        System.out.println("Curtindo a publicação no GooglePlus...");
    }
}

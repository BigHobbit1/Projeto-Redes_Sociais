package br.inatel.cgd.plataformas;
import br.inatel.cgd.redes.Compartilhamento;
import br.inatel.cgd.redes.RedeSocial;
import br.inatel.cgd.redes.VideoConferencia;

public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento{

    public Facebook(String senha, int numAmigos, String email, String nomeUsuario) {

        super(senha, numAmigos, email, nomeUsuario);
    }

    @Override
    public void compartilhar() {
        System.out.println("Comparilhando um conteudo no Facebook...");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Facebook...");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no Facebook...");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentario no Facebook...");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fazendo Streaming no Facebook Gaming...");
    }

    @Override
    public void curtirPublicacao(){
        System.out.println("Curtindo a publicação no Facebook...");
    }
}

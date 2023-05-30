package br.inatel.cgd.usuario;
import br.inatel.cgd.redes.RedeSocial;

public class Usuario {

    private String nome;
    private String email;
    public RedeSocial[] redeSocial = new RedeSocial[4];

    public Usuario(RedeSocial[] redesSociais) {
        for(int i = 0; i < redesSociais.length; i++){
            if(redesSociais[i] != null) {
                try {
                    redeSocial[i]=redesSociais[i];
                }catch(NullPointerException e){
                    System.out.println("Erro: " + e);
                }finally {
                    redeSocial[i] = redesSociais[i];
                }
            }
        }
    }
}

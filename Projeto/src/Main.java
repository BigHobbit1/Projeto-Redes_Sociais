import java.util.Scanner;
import br.inatel.cgd.plataformas.Facebook;
import br.inatel.cgd.plataformas.Twitter;
import br.inatel.cgd.plataformas.Instagram;
import br.inatel.cgd.plataformas.GooglePlus;
import br.inatel.cgd.redes.RedeSocial;
import br.inatel.cgd.usuario.Usuario;
import javax.security.auth.login.LoginException;

public class Main {
    public static void main(String[] args) {

        // As duas redes sociais diferentes para testes podem ser o Facebook e o twitter

        RedeSocial[] redesSociais = new RedeSocial[4];
        redesSociais[0] = new Facebook("123", 3870, "marcuswilians@gea.inatel.br", "markwill2099");
        redesSociais[1] = new Twitter("345", 4000, "marcuswilians2099@gmail.com", "markwill3000");
        redesSociais[2] = new Instagram("456", 2000000, "oliveirachagas@gec.inatel.br", "vitorchagas");
        redesSociais[3] = new GooglePlus("789", 1700, "oliveirachagas@gec.inatel.br", "vitoroliveira");

        Usuario usuario = new Usuario(redesSociais);

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 5) {
            System.out.println();
            System.out.println("Escolha um site de uma rede social para navegar:");
            System.out.println();
            System.out.println("1. https://www.facebook.com");
            System.out.println("2. https://www.twitter.com");
            System.out.println("3. https://www.instagram.com");
            System.out.println("4. https://www.googleplus.com");
            System.out.println("5. Sair");
            System.out.println();

            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                RedeSocial redeSocial = usuario.redeSocial[opcao - 1];
                if (redeSocial != null) {
                    System.out.print("O email salvo do usuário é: " + redeSocial.getEmail());
                    System.out.println();

                    System.out.print("Digite a sua senha: ");
                    String senha = scanner.next();
                    System.out.println();

                        try {
                            String emailOuUsuario = null;
                            redeSocial.realizarLogin(null, senha);
                            acessarRedeSocial(redeSocial);
                        } catch (LoginException e) {
                            System.out.println(e.getMessage());
                            //System.out.println("O usuário entrou com um dado incorreto!");
                        }

                } else {
                    System.out.println("A rede social não corresponde a este usuário! ");
                }
            } else if (opcao != 5) {

                System.out.println("Opção inválida! ");
                System.out.println("Digite novamente. ");
            }

        }
        scanner.close();
    }

    private static void acessarRedeSocial(RedeSocial redeSocial) {

        if (redeSocial instanceof Facebook) {
            redeSocial.postarFoto();
            redeSocial.curtirPublicacao();
            redeSocial.postarComentario();
            ((Facebook) redeSocial).fazStreaming();
            System.out.println("O nome do usuário deste perfil de rede social é: " + redeSocial.getNomeUsuario());
            System.out.println("Quantidade de amigos na rede social: " + redeSocial.getNumAmigos());

        } else if (redeSocial instanceof Twitter) {
            redeSocial.postarFoto();
            redeSocial.curtirPublicacao();
            redeSocial.postarComentario();
            ((Twitter) redeSocial).compartilhar();
            System.out.println("O nome do usuário deste perfil de rede social é: " + redeSocial.getNomeUsuario());
            System.out.println("Quantidade de amigos na rede social: " + redeSocial.getNumAmigos());

        } else if (redeSocial instanceof Instagram) {
            redeSocial.postarFoto();
            redeSocial.curtirPublicacao();
            redeSocial.postarComentario();
            System.out.println("O nome do usuário deste perfil de rede social é: " + redeSocial.getNomeUsuario());
            System.out.println("Quantidade de amigos na rede social: " + redeSocial.getNumAmigos());

        } else if (redeSocial instanceof GooglePlus) {
            redeSocial.postarFoto();
            redeSocial.curtirPublicacao();
            redeSocial.postarComentario();
            ((GooglePlus) redeSocial).compartilhar();
            ((GooglePlus) redeSocial).fazStreaming();
            System.out.println("O nome do usuário deste perfil de rede social é: " + redeSocial.getNomeUsuario());
            System.out.println("Quantidade de amigos na rede social: " + redeSocial.getNumAmigos());
        }
    }
}
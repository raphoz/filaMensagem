package aplicacao;

//Executavel
import java.util.Scanner;
import entidades.Mensagem;
import fila.FilaMensagens;

public class AtendimentoMensagem {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		FilaMensagens filaMensagem = new FilaMensagens();
		int opcao, opcaoAux;
		String contato, msg, nome;
		int motivo;
		

		do {
			System.out.println("1- Enviar Mensagem \n2- Ler Mensagens \n0- Encerrar atendimento");
			opcao = input.nextInt();

			switch (opcao) {
			case 0:
				if (filaMensagem.isEmpty()) {
					System.out.println("Encerrando o atendimento");
				} else {
					System.out.println("Ainda há mensagens na fila!");
					opcao = -1;
				}
				break;
			case 1:
				System.out.println("Deseja informar seu nome? ");
				System.out.println("1- sim\t 2- nao");
				int opcaoNome = input.nextInt();
				if (opcaoNome == 1) {
					System.out.print("Informe seu nome");
					nome = input.next();					
				}

				do {
					System.out.print("Informe seu email/telefone: ");
					contato = input.next();
					System.out.println("Informe o motivo do contato\n1- Reclamacao \n2- Sugestao");
					motivo = input.nextInt();
				
					System.out.print("Digite a mensagem: ");
					input.nextLine();
					msg = input.nextLine();
				
				} while (contato == " " || motivo == 0 || msg == null);
				
				System.out.print("Mensagem cadastrada no sistema\nDeseja voltar ao menu?\n1- sim\n2- nao\n");
				opcaoAux = input.nextInt();
				if (opcaoAux == 2) {
					System.out.print("Encerrando");
					opcao = 0;
				}
				
				break;

			default:
				System.out.println("Opcao invalida");
			}
		} while (opcao != 0);

	}
}

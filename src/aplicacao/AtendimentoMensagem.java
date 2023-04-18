package aplicacao;

//Executavel
import java.util.Scanner;
import entidades.Mensagem;
import fila.FilaMensagens;

public class AtendimentoMensagem {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		FilaMensagens filaMensagem = new FilaMensagens();
		FilaMensagens filaReclamacao = new FilaMensagens();
		FilaMensagens filaSugestao = new FilaMensagens();
		int opcao, opcaoAux;
		String contato, msgText, nome;
		int motivo;
		

		do {
			System.out.println("1- Enviar Mensagem \n2- Ler Mensagens \n0- Encerrar atendimento");
			opcao = input.nextInt();

			switch (opcao) {
			case 0:
				if (filaMensagem.isEmpty()) {
					System.out.println("Encerrando o atendimento");
				} else {
					System.out.println("Ainda existe mensagens na fila!");
					opcao = -1;
				}
				break;
			case 1:
				Mensagem msg = new Mensagem();
				System.out.println("Deseja informar seu nome? ");
				System.out.println("1- sim\t 2- nao");
				int opcaoNome = input.nextInt();
				if (opcaoNome == 1) {
					System.out.print("Informe seu nome: ");
					input.nextLine();
					nome = input.nextLine();
					msg.nome = nome;
				}

				do {
					System.out.print("Informe seu email/telefone: ");
					contato = input.next();
					msg.contato = contato;
					System.out.println("Informe o motivo do contato\n1- Reclamacao \n2- Sugestao");
					motivo = input.nextInt();
					msg.motivoContato = motivo;

					System.out.print("Digite a mensagem: ");
					input.nextLine();
					msgText = input.nextLine();
					msg.msgText = msgText;
					filaMensagem.insert(msg);
					
					if(motivo == 1) {
						filaReclamacao.insert(msg);
						msg.motivoContatoStr = "Reclamacao";
					}
					else {
						filaSugestao.insert(msg);
						msg.motivoContatoStr = "Sugestao";
					}

				} while (contato == " " || motivo == 0 || msgText == null);

				System.out.print("Mensagem cadastrada no sistema\nDeseja voltar ao menu?\n1- sim\n2- nao\n");
				opcaoAux = input.nextInt();
				if (opcaoAux == 2) {
					System.out.print("Encerrando");
					opcao = 0;
				}

				break;

			case 2:
				if(filaMensagem.size() > 0)
					System.out.println(filaMensagem.remove());
				else
					System.out.println("Sem mensagens para serem lidas");
				break;

			default:
				System.out.println("Opcao invalida");
			}
		} while (opcao != 0);

		input.close();
	}
}

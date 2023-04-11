package aplicacao;

//Executavel
import java.util.Scanner;
import entidades.Mensagem;
import fila.FilaMensagens;

public class AtendimentoMensagem {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		FilaMensagens filaMensagem = new FilaMensagens();
		int opcao;

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
					System.out.println("Informe seu nome");
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				}

				break;
			case 2:

				break;
				
			case 3:
			
			break;
				

			default:
				System.out.println("Retorno Menu!");
			}

		} while (opcao != 0);

		input.close();

	}

}

package entidades;

public class Mensagem {

	public String nome;
	public String contato;
	public int motivoContato;
	public String msgText;
	public String motivoContatoStr;
	
	
	

	public String toString() {
		return "Mensagem nao lida \nNome(opcional): " + nome + ", \nContato: " + contato
				+ ", \nMotivo do contato: " + motivoContatoStr + ", \nmensagem: " + msgText;
	}

}

package entidades;

public class Mensagem {

	protected String nome;
	protected String contato;
	protected int motivoContato;
	protected String msg;

	public Mensagem(String nome, String contato, int motivoContato, String msg) {
		super();
		this.nome = nome;
		this.contato = contato;
		this.motivoContato = motivoContato;
		this.msg = msg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public int getMotivoContato() {
		return motivoContato;
	}

	public void setMotivoContato(int motivoContato) {
		this.motivoContato = motivoContato;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	
}

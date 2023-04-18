package fila;

import entidades.Mensagem;


public class FilaMensagens {

	int N = 5;
	Mensagem dados[] = new Mensagem[N];
	
	//ClassA N = new ClassA(); - um jeito de alocação dinamica
	int ini, fim, count;

	public void init() {
		
		ini = fim = 0;

	}

	public boolean isEmpty() {

		if (count == 0)
			return true;
		else
			return false;
	}

	public boolean isFull() {
		if (count == N)
			return true;
		else
			return false;
	}



	public void Clean() {
		if (!isEmpty()) {
			ini = 0;
			fim = 0;
			count = 0;
		}
	}

	public int Size() {
		return count;
	}


}

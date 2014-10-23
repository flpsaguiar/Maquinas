package Maquinas;

/**
 * Created by Felipe Aguiar on 06/10/2014.
 */
public class Molde {
	private char tamanho;
	private int quantidade;

	public Molde(char tamanho) {
		this.tamanho = tamanho;
		this.quantidade = 0;
	}

	public char getTamanho() {
		return tamanho;
	}

	public synchronized void incQuantidade() {
		this.quantidade++;
	}

	public void decQuantidade() {
		this.quantidade--;
	}

	public int getQuantidade() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		}
		return this.quantidade;
	}
}

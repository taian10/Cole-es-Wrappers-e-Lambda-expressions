package br.com.bytebank.banco.modelo;

public class GuardadorDeReferencias {
	
	private Object[] referencias;
	private int posicaoLivre;
	
	public GuardadorDeReferencias() {
		this.referencias = new Object[10];
		this.posicaoLivre = 0;
	}

	public void adiciona(Object ref) {
		this.referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;
	}

	public int pegaQuantidadeDeElementos() {
		return this.posicaoLivre;
	}

	public Object Referencia(int pos) {
		return this.referencias[pos];
	}

}

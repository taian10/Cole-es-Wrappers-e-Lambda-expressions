package br.com.bytebank.banco.teste.util;

import java.util.Collection;
import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteArrayList {

	// Array []
	public static void main(String[] args) {


		List<Conta> lista = new Vector<Conta>();
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		//Collection<Conta> lista = new Vector<Conta>();
		
		Conta ref = lista.get(0);
		
		Conta cc = new ContaCorrente(22, 11);
		guardador.adiciona(cc);
		
		Conta cc2 = new ContaCorrente(22, 22);
		guardador.adiciona(cc2);
		
		int tamanho = guardador.pegaQuantidadeDeElementos();
		System.out.println(tamanho);
		
		//Conta ref = guardador.Referencia(1);
		System.out.println(ref.getNumero());
		
		
		
		
		
	}

}

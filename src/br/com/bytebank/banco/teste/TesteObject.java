package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {

//		System.out.println("x");
//		System.out.println(3);
//		System.out.println(false);

		ContaCorrente cc = new ContaCorrente(22, 33);
		Object cp = new ContaPoupanca(26, 35);
		Object cliente = new Cliente();

		System.out.println(cc);
		System.out.println(cp);

		//println(cliente);
	}

	static void println() {}
	static void println(int a) {}
	static void println(boolean valor) {}
	static void println(ContaCorrente conta) {}

	static void println(Object referenciado) {

	}

}

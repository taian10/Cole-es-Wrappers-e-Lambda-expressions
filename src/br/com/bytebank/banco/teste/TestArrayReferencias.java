package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TestArrayReferencias {

    public static void main(String[] args) {

    	// alterando o tipo
        Conta[] contas = new Conta[5];
        ContaCorrente cc1 = new ContaCorrente(22, 11);
        contas[0] = cc1;

        
        // cria instância de ContaPoupanca
        ContaCorrente cc2 = new ContaCorrente(22, 22);
        contas[1] = cc2;    

        System.out.println( contas[1].getNumero()  );

        
        // não compila
        ContaCorrente ref = (ContaCorrente) contas[0];
        System.out.println(cc2.getNumero());
        System.out.println(ref.getNumero());

    }
}
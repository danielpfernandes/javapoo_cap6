package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.*;

public class TesteDoBanco {
	public static void main(String[] args) {
		Banco meuBanco = new Banco("Banco do Brasil", 001);
		ContaCorrente c1 = new ContaCorrente();
		c1.setTitular("Batman");
		c1.setNumero(1);
		c1.setAgencia("1000");
		c1.deposita(100000);
		meuBanco.adiciona(c1);

		ContaPoupanca c2 = new ContaPoupanca();
		c2.setTitular("Coringa");
		c2.setNumero(2);
		c2.setAgencia("2000");
		c2.deposita(890000);
		meuBanco.adiciona(c2);
		
		meuBanco.mostraContas();
	}
}
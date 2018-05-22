package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.*;

public class Principal {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();
		conta.deposita(100.0);
		System.out.println(conta.getSaldo());
	}
}

package br.com.caelum.contas.main;
import br.com.caelum.contas.modelo.ContaPoupanca;

public class TesteDaConta {
	public static void main(String[] args) {
		ContaPoupanca conta = new ContaPoupanca();
		conta.deposita(200);
		System.out.println(conta.getSaldo());
	}
}

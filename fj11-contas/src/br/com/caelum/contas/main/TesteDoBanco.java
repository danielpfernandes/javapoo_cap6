package br.com.caelum.contas.main;
import br.com.caelum.contas.Banco;

public class TesteDoBanco {
	public static void main(String[] args) {
		Banco meuBanco = new Banco();
		meuBanco.setNome("Banco do Brasil");
		System.out.println(meuBanco.getNome());
	}
}
package contas.main;
import contas.Banco;

public class TesteDoBanco {
	public static void main(String[] args) {
		Banco meuBanco = new Banco();
		meuBanco.setNome("Banco do Brasil");
		System.out.println(meuBanco.getNome());
	}
}
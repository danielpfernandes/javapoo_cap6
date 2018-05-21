package contas.main;

public class TesteDoBanco {
	public static void main(String[] args) {
		contas.Banco meuBanco = new contas.Banco();
		meuBanco.setNome("Banco do Brasil");
		System.out.println(meuBanco.getNome());
	}
}
package contas.main;
import contas.modelo.Conta;

public class TesteDaConta {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(200);
		System.out.println(conta.getSaldo());
	}
}

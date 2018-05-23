package br.com.caelum.contas.modelo;

public class Banco {
	private String nome;
	private int numero;
	private Conta[] contas;
	
	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.contas = new Conta[10];
	}
	
	public void adiciona(Conta conta) {
		for (int i = 0; i < this.contas.length; i++) {
			if (contas[i] == null) {
				this.contas[i] = conta;
				break;
			};
		}
	}
	
	public void mostraContas() {
		for (int i = 0; i < this.contas.length; i ++) {
			if (contas[i] != null) {
				System.out.println("Banco: " + this.nome);
				System.out.println("Titular: " + contas[i].getTitular() );
				System.out.println("Agencia: " + contas[i].getAgencia() );
				System.out.println(contas[i].getTipo() + ": " + contas[i].getNumero() );
				System.out.println("Saldo: " + contas[i].getSaldo() + "\n");
			}
			
		}
	}
}

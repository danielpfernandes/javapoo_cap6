package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaArrays {
	
	public static void main(String[] args) {
		Conta[] contas = new Conta[10];
		
		for (int i = 0; i < contas.length; i++) {
			Conta conta = new ContaCorrente();
			conta.deposita(i * 100.0);
			contas[i] = conta;
			System.out.println("Conta n" + i+1 +" saldo:" + conta.getSaldo() );
		}
		
		double media = 0;
		double total = 0;
		double divisor = contas.length;		
		
		for (int x = 0; x < contas.length; x++) {			
			total += contas[x].getSaldo();		
			
		}
		
		media = total / divisor;			
		
		System.out.println("Média de depósitos: " + media);
	}	
}

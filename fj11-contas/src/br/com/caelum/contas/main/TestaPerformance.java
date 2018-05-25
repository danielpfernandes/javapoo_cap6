package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {
	public static void main(String[] args) {
		System.out.println("Iniciando...");
		Collection<Integer> teste = new HashSet<>();
		long inicio = System.currentTimeMillis();
		
		int total = 3000;
		
		for (int i = 0; i < total; i++) {
			teste.add(i);
		}
		
		long fimInsercao = System.currentTimeMillis();
		long tempoInsercao = fimInsercao - inicio;
		System.out.println("Tempo gasto de insercao: "
		+ tempoInsercao);
		
		inicio = System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}		
		long fimBusca = System.currentTimeMillis();
		long tempoBusca = fimBusca - inicio;
		
		System.out.println("Tempo gasto de busca: " 
		+ tempoBusca);
	}
}

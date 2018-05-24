package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaLista {
	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("Sérgio");
		lista.add("Joao");
		lista.add("Guilherme");
		
		System.out.println(lista);
		Collections.sort(lista);
		System.out.println(lista);
	}
}

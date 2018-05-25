package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestaComparador {
	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("João");
		lista.add("Sérgio");
		lista.add("Paulo");
		lista.add("Escaribidizadefalo");
		lista.add("Guilherme");

		Collections.sort(lista, new Comparator<String>() {
			public int compare(String s1, String s2) {
				return Integer.compare(s1.length(), s2.length());
			}
		});
		
		System.out.println(lista);
	}
}

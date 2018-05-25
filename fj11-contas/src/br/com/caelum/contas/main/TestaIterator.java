package br.com.caelum.contas.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestaIterator {
	public static void main(String[] args) {
		Set<String> lista = new HashSet<>();

		lista.add("item 1");
		lista.add("item 2");
		lista.add("item 3");

		Iterator<String> i = lista.iterator();

		while (i.hasNext()) {
			String palavra = i.next();
			System.out.println(palavra);
		}
	}
}

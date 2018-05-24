package br.com.caelum.contas.main;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestaSet {
	public static void main(String[] args) {
		Set<String> conjunto = new HashSet<>();
		conjunto.add("java");
		conjunto.add("vraptor");
		conjunto.add("scala");
		conjunto.add("python");
		conjunto.add("javascript");

		for (String palavra : conjunto) {
			System.out.println(palavra);
		}

		Set<String> conjuntoTree = new TreeSet<>();

		for (String string : conjunto) {
			conjuntoTree.add(string);
		}
		System.out.println();
		for (String palavra : conjuntoTree) {
			System.out.println(palavra);
		}

	}
}

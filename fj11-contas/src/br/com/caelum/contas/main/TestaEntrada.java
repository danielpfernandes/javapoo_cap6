package br.com.caelum.contas.main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestaEntrada {
	public static void main(String[] args) throws IOException, FileNotFoundException {
		InputStream is = new FileInputStream("arquivo.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		
		do {
			System.out.println(s);
			s = br.readLine();
		} while (s != null);
		
		br.close();
		//System.out.println(isr.read());
		//System.out.println(br.readLine());
	}
}

package br.com.caelum.contas.main;

public class ProgramaRunnable implements Runnable {
	private int id;
	
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("Programa " + id + " valor: " + i);
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}

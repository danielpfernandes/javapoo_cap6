package br.com.caelum.contas.main;

public class TestaThread {
	public static void main(String[] args) {
/*		ProgramaRunnable p1 = new ProgramaRunnable();
		p1.setId(1);
		Thread t1 = new Thread(p1);
		t1.start();
		
		ProgramaRunnable p2 = new ProgramaRunnable();
		p2.setId(2);
		Thread t2 = new Thread(p2);
		t2.start();
*/

/*		//USANDO JAVA L8 LAMBDA
		Runnable r1 = () -> {
			for (int i = 0; i < 10000; i++)
				System.out.println("programa 1 valor " + i);
		};
		Thread t1 = new Thread(r1);
		t1.start();
		
		Runnable r2 = () -> {
			for (int i = 0; i < 10000; i++)
				System.out.println("programa 2 valor " + i);
		};
		Thread t2 = new Thread(r2);
		t2.start();
	}
	*/
		
		//ENXUGANDO MAIS O CÓDIGO COM JAVA 8 LAMBDA
		
		new Thread (()-> {
			for (int i = 0; i <10000; i++) {
				System.out.println("Programa 1 valor " + i);
			}
		}).start();
		
		new Thread (()-> {
			for (int i = 0; i <10000; i++) {
				System.out.println("Programa 2 valor " + i);
			}
		}).start();
	}
}

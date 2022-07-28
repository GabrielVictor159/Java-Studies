package aulatrhead;

public class Thread2Execucao {

	public static void main(String[] args) {
		Exemplo2Thread t1 = new Exemplo2Thread("Thread1");
		Exemplo2Thread t2 = new Exemplo2Thread("Thread2");
		t1.start();
		t2.start();

	}

}

package aulatrhead;

public class Exemplo2Thread implements Runnable{
	private String nome;
	private Thread thread = null;
	public Exemplo2Thread(String nome) {
		this.nome = nome;
	}
	public void start() {
		if(thread == null) {
			thread = new Thread(this, nome);
			thread.start();
		}
	}
	public void run() {
		for(int i=1; i<10; i++) {
			System.out.println(i + "" + nome);
		}
	}
}

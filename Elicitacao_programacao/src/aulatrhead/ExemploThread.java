package aulatrhead;

public class ExemploThread extends Thread {
private String nome;
public ExemploThread(String nome){
	this.nome = nome;
}
public void run () {
	for(int i=1; i<10; i++) {
		System.out.println(i + "" + nome);
	}
}
}

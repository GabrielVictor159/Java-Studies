package aulatrhead;

public class TrheadExecucao {

	public static void main(String[] args) {
		ExemploThread t1 = new ExemploThread("thread 1");
        ExemploThread t2 = new ExemploThread("thread 2");
        t1.start();
        t2.start();
	}

}

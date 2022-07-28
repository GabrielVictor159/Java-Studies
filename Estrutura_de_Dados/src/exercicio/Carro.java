package exercicio;

public class Carro {

	public static void main(String[] args) {
		Peca Motor = new Peca(1,"MOTOR");
		Peca Turbo = new Peca(2,"TURBO");
		Peca Cambio = new Peca(3,"CAMBIO");
		Peca Freio = new Peca(4,"FREIO");
		Peca Chaci = new Peca(5,"CHACI");
		Montadora m= new Montadora();
		System.out.println("\n\n---------EMPILHANDO--------");
		m.empilhar(Motor);
		m.empilhar(Turbo);
		m.empilhar(Cambio);
		m.empilhar(Freio);
		m.empilhar(Chaci);
		System.out.println("\n");
		System.out.println("Imprimindo pilha");
		m.printcarro();
	}

}

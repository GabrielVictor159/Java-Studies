package aula1;
import java.util.Scanner;
public class executavel {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		pessoa p1= new pessoa();
		System.out.println("digite seu nome");
	    p1.nome = leitura.next();
	    System.out.println("digite sua idade");
	    p1.idade = leitura.nextInt();
	    System.out.println("digite seu salario");
	    p1.salario = leitura.nextDouble();
	    System.out.println("digite seu cargo");
	    p1.cargo = leitura.next();
	    
		
		

	}

}

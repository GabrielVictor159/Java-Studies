package exercicio;
import java.util.Scanner;
public class executavel {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
	System.out.println("escreva um valor");
	calcula c1 = new calcula();
	double a = leitura.nextDouble();
	System.out.println("escreva outro valor");
	double b = leitura.nextDouble();
	System.out.println("escreva o numero a fatorar:");
	int z = leitura.nextInt();
     System.out.println("a soma dos valores é:" + c1.soma(a, b));
     System.out.println("o fatorial do valor sera:" + c1.fatorial(z));
	}

}

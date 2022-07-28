package aula03;
import java.util.ArrayList;
import java.util.Scanner;
public class ListaNumeros {
	public static void main(String[] args) {
	Scanner leitura  = new Scanner(System.in);
	ArrayList<Integer> lista = new ArrayList();
	int numero;
	do {
		System.out.println("escreva um numero:");
		numero=Integer.parseInt(leitura.nextLine());
		if(numero!=0) {
			lista.add(numero);
			lista.get(0);
			lista.remove(0);
		}
	}
		while(numero!=0);
		System.out.println("os números incluidos foram:");
		
		for(int i=0; i<lista.size(); i++) {
			System.out.println(lista.get(i));
		}
			
		
	}
	}


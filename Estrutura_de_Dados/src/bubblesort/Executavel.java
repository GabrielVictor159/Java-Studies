
package bubblesort;
import java.util.Scanner;
public class Executavel {
    public static void main(String args[]){
        int x;
    vetor lista = new vetor();
    Scanner leitura = new Scanner(System.in);
    for(int i=0; i<5; i++){
    System.out.println("escreva um valor para o vetor");
    x=leitura.nextInt();
    lista.adicionar(x);
    }
    lista.organizar();
    lista.mostrar();
    }
}
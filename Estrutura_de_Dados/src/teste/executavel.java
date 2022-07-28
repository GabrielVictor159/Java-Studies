package teste;

import bubblesort.vetor;

public class executavel {
	public static void main(String args[]){
    int quantidade =4;
    int inicio=0;
    int[] vetor = new int[quantidade];
    vetor[0]=30;
    vetor[1]=20;
    vetor[2]=20;
    vetor[3]=20;
    long tempoInicial = System.currentTimeMillis();
    quicksort(vetor,0,vetor.length-1);
    long tempoFinal = System.currentTimeMillis();
    System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");
	}
	public static void quicksort(int[] Vetor,int inicio,int fim){
        if(inicio<fim){
          int posicaopivo=separar(Vetor,inicio,fim);
          quicksort(Vetor, inicio, posicaopivo -1);
          quicksort(Vetor, posicaopivo +1, fim);

        }
    }
	private static int separar(int[] vetor, int inicio, int fim){
	     int pivo = vetor[inicio];
	     int i = inicio + 1, f=fim;
	     while (i<=f){
	         if(vetor[i] <= pivo){
	             i++;
	         }
	         else if(pivo<vetor[f]){
	             f--;
	         }
	         else{
	             int troca = vetor[i];
	             vetor[i]= vetor[f];
	             vetor[f]=troca;
	             i++;
	             f--;
	         }
	     }
	     for (int k=0;k<vetor.length;k++){
	    	 System.out.println(vetor[k]);
	    	 }
	    	 vetor[inicio] = vetor[f];
	    	 vetor[f] = pivo;
	    	 return f;
	    	 }
}

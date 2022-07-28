package teste;

public class Separar {
	public static int separar(int[] vetor, int inicio, int fim){
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

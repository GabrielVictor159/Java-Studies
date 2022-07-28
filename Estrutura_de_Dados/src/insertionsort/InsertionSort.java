package insertionsort;

public class InsertionSort {

	public static void main(String[] args) {
		int quantidade = 4;
		int[] vetor = new int[quantidade];
		vetor[0]=30;
		vetor[1]=20;
		vetor[2]=10;
		vetor[3]=40;
		long tempoInicial = System.currentTimeMillis();
		insertionSort(vetor);
		long tempoFinal = System.currentTimeMillis();
		System.out.println("Executado em = " + (tempoFinal -
		tempoInicial) + " ms");
	}
		public static void insertionSort(int[] vetor) {
			int j;
			int key;
			int i;
			for (j = 1; j < vetor.length; j++)
			{
			key = vetor[j];
			
			for (i = j - 1; (i >= 0) && (vetor[i] > key); i--)
			{
			vetor[i + 1] = vetor[i];
			}
			vetor[i + 1] = key;
			}
			for (int k=0;k<vetor.length;k++){
			System.out.println(vetor[k]);
			}
			
			
		}
	}



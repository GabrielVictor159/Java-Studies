package teste;

public class QuickSort {
    public static void quicksort(int[] Vetor,int inicio,int fim){
        if(inicio<fim){
        	Separar a= new Separar();
          int posicaopivo=a.separar(Vetor,inicio,fim);
          quicksort(Vetor, inicio, posicaopivo -1);
          quicksort(Vetor, posicaopivo +1, fim);
          long tempoInicial = System.currentTimeMillis();
        quicksort(Vetor,0,Vetor.length-1);
        long tempoFinal = System.currentTimeMillis();
        System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");

        }
    }
    	 
    }

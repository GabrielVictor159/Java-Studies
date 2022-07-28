
package bubblesort;
import java.util.Arrays;
public class vetor {
    int x[] = new int[5];
    int aux;
    int z=0;
    public void organizar(){
    for(int i=0; i<=5; i++){
    for(int f=0; f<4; f++){
    if(x[f]>x[f+1]){
    aux=x[f];
    x[f]=x[f+1];
    x[f+1]=aux;
    }
    }
    }
    }
    public void adicionar(int valor){
    x[z]=valor;
    z++;
    }
    public void mostrar(){
    for(int i=0; i<5; i++){
    System.out.println(""+x[i]+"\n");
    }
    }
}

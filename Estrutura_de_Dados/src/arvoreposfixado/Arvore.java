
package arvoreposfixado;
import java.util.Arrays;
import javax.swing.JOptionPane;
public class Arvore {
    private Numero numero=null;
    private Arvore direita=null;
    private Arvore esquerda=null;
    private Numero[] subarvores = new Numero[9];
    private int contador=0;
    public void Adicionar(Numero n){
    if(numero==null){
    numero=n;
    subarvores[contador]=n;
    contador++;
    }
    else if (n.getDado()<numero.getDado()){
    if(esquerda==null){
    esquerda=new Arvore();
    }
    esquerda.Adicionar(n);
    subarvores[contador]=n;
    contador++;
    }
    else if(n.getDado()>numero.getDado()){
    if(direita==null){
    direita=new Arvore();
    }
    direita.Adicionar(n);
    subarvores[contador]=n;
    contador++;
    }
    }
    public void exibirordem(Arvore arv){
    if(arv!= null){
    for(int i=0; i<subarvores.length; i++){
    JOptionPane.showMessageDialog(null,subarvores[i]);
    }
    }
    }
public String toString(){
return Arrays.toString(subarvores);
}    
}

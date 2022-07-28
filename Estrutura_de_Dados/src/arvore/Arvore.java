
package arvore;
import java.util.Arrays;
import javax.swing.JOptionPane;
public class Arvore {
    private Numero num=null;
    private Arvore dir= null;
    private Arvore esq= null;
    private Numero[] subArvores = new Numero[11];
    public int contador = 0;
    public void adicionar(Numero n){
    if(num==null){
    num=n;
    subArvores[contador]= n;
    contador++;
    }
    else if(n.getDado() < num.getDado()){
    if(esq == null){
    esq= new Arvore();
    }
    esq.adicionar(n);
    subArvores[contador] = n;
    contador++;
    }
    else if(n.getDado() > num.getDado()){
    if(dir==null){
    dir = new Arvore();
    }
    dir.adicionar(n);
    subArvores[contador]=n;
    contador++;
    }
    }
    public void exibirOrdem (Arvore arv){
    if(arv!= null) {
    for(int i=0; i<subArvores.length; i++){
    JOptionPane.showMessageDialog(null, subArvores[i]);
    }
       
    
    }
    }
   public String toString(){
    return Arrays.toString(subArvores);  
   }}


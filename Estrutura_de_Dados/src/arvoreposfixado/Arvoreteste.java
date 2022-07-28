
package arvoreposfixado;
import javax.swing.JOptionPane;
public class Arvoreteste {
    public static void main (String[] args){
    Arvore a = new Arvore();
    Numero n1= new Numero();
    Numero n2= new Numero();
    Numero n3= new Numero();
    Numero n4= new Numero();
    Numero n5= new Numero();
    Numero n6= new Numero();
    Numero n7= new Numero();
    Numero n8= new Numero();
    Numero n9= new Numero();
    n1.setDado(42);
    n2.setDado(41);
    n3.setDado(43);
    n4.setDado(40);
    n5.setDado(46);
    n6.setDado(47);
    n7.setDado(39);
    n8.setDado(48);
    n9.setDado(45);
    a.Adicionar(n1);
    a.Adicionar(n2);
    a.Adicionar(n3);
    a.Adicionar(n4);
    a.Adicionar(n5);
    a.Adicionar(n6);
    a.Adicionar(n7);
    a.Adicionar(n8);
    a.Adicionar(n9);
    JOptionPane.showMessageDialog(null, "pos fixado");
    a.exibirordem(a);
    }
}

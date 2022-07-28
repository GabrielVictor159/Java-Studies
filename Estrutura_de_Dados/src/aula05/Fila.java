package aula05;
import javax.swing.JOptionPane;
public class Fila {
int inicio;
int fim;
int tamanho; 
int qtdeElementos;
String f[];
String elementos;
public Fila() {
	inicio=fim=-1;
	tamanho = 3;
	f = new String[tamanho];
	qtdeElementos = 0;
}
public boolean estaVazia() {
	if(qtdeElementos==0) {
		return true;
	}
	return false;
}
public void adicionar (String elemento) {
	if(!estaVazia()) {
		if(inicio==-1) {
			inicio = 0;
		}
		fim++;
		f[fim]=elemento;
		qtdeElementos++;
	}
}
public void remover() {
	if(!estaVazia()) {
		inicio++;
		qtdeElementos--;
	}
}
public void mostrar() {
	String elementos = "";
	for(int i=inicio;i<=fim; i++) {
		elementos+=f[i]+" ";
		
	}
	JOptionPane.showMessageDialog(null, elementos);
}
}

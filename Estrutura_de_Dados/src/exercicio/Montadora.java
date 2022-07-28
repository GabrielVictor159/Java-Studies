package exercicio;

public class Montadora {

private int tamanhopilha=4;
private Peca[] carro;
private int ponteiro;

public Montadora(){
this.carro= new Peca[tamanhopilha];
this.ponteiro=0;
}

public Peca[] getCarro() {
	return carro;
}

public void setCarro(Peca[] Carro) {
	this.carro=Carro;
}

public void empilhar (Peca Peca) {
	System.out.println("empilhando " +Peca.getNome()+ ":");
	movimentarPilha();
	carro[0]=Peca;
	ponteiro++;
	printcarro();
}

public void movimentarPilha() {
for (int i = 0; i < ponteiro; i++) {
if(ponteiro-i < carro.length){
carro[ponteiro-i] = carro[ponteiro-i-1];
}
}
carro[0] = null;
}

public void printcarro() {
	String retorno="";
	for(int i=0; i<carro.length; i++) {
		retorno += String.format("\t\t[%s] => %s ", i, carro[i] != null ?
				carro[i].getNome() : "");
	}
}
}


package secretaria;
public class Vetor {
private Reclamacoes[] reclamacoes= new Reclamacoes[100000];
public void adicionar(int numero, Reclamacoes reclamacao) {
	reclamacoes[numero]=reclamacao;
}
public void remover(int numero) {
	reclamacoes[numero]=null;
}
public Reclamacoes mostrar(int numero) {
	return reclamacoes[numero];
}
public void adicionarconcerto(int numero, Concerto concertos) {
	reclamacoes[numero].setConcerto(concertos);
}
public void adicionarendereco(int numero,Endereco enderecos) {
	reclamacoes[numero].setEndereco(enderecos);
}
}
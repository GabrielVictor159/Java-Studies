package exercicio;

public class Peca {
	private int codigo;
	private String nome;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Peca(int Codigo, String Nome) {
		this.codigo=Codigo;
		this.nome=Nome;
	}
	
	public boolean equals(Object p) {
		return ((Peca) p).getNome().equals(this.getNome());
	}
	
	@Override
	public String toString() {
		return this.nome;
	}
}

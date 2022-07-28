package secretaria;

public class Concerto {
	private int numero;
	private double valor;
	private String data;
    public Concerto(int numero, double valor, String data) {
    	this.numero=numero;
    	this.valor=valor;
    	this.data=data;
    }
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	

	@Override
	public String toString() {
		return " ------concerto realizado-----\n"+" numero:"+numero+"\n valor:"+valor+"\n data do concerto:"+data;
	}

	

	
	
	
}

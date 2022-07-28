package banco;

public class conta {

	public String numero;
	public String nome;
	public double saldo;
	public void sacar(double valor) {
		saldo = saldo - valor;
	}
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	public double calculartributo(){
		return saldo * 0.05;
	}
	
}

package aula05;

public class funcionario {
	protected String nome;
	protected double salario;
	protected int cpf;

	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void bonificar() {
		salario = salario + (salario * 0.10);
	}
	@Override
	public String toString() {
		return "funcionario [nome=" + nome + ", salario=" + salario + ", cpf=" + cpf + "]";
	}
	
}

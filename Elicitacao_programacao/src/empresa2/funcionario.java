package empresa2;

public class funcionario {
	private int numerodamatricula;
private String nome;
private int idade;
private String cargo;
private double salario;
public funcionario() {
	salario = 1500;
}
public funcionario(String nome, int idade) {
	this.nome=nome;
	this.idade=idade;
}
public funcionario(int numerodamatricula, String nome,  int salario) {
	this.nome = nome;
	this.numerodamatricula = numerodamatricula;
	this.salario = salario;
}

public int getNumerodamatricula() {
	return numerodamatricula;
}

public void setNumerodamatricula(int numerodamatricula) {
	this.numerodamatricula = numerodamatricula;
}

public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getIdade() {
	return idade;
}
public void setIdade(int idade) {
	this.idade = idade;
}
public String getCargo() {
	return cargo;
}
public void setCargo(String cargo) {
	this.cargo = cargo;
}
public double getSalario() {
	return salario;
}
public void setSalario(int salario) {
	this.salario = salario;
}

@Override
public String toString() {
	return "funcionario [numerodamatricula=" + numerodamatricula + ", nome=" + nome + ", idade=" + idade + ", cargo="
			+ cargo + ", salario=" + salario + "]";
}

}

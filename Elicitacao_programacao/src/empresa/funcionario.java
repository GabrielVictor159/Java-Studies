package empresa;

public class funcionario {
 private String nome;
 private String matricula;
 private int idade;
 private Double salario;
 public int getIdade() {
	return idade;
}
public void setIdade(int idade) {
	this.idade = idade;
}
public Double getSalario() {
	return salario;
}
public void setSalario(Double salario) {
	this.salario = salario;
}
public void setNome(String Nome) {
		this.nome = Nome;
	}
 public String getNome() {
	 return nome;
 }
 public void setMatricula(String Matricula) {
	 this.matricula = Matricula;
 }
 public String getMatricula() {
	 return matricula;
 }
 
 public boolean aposentadoria() {
	 return idade>=65;
	 
 }
 public void bonificar(double valor) {
	 salario = salario + valor;
 }
@Override
public String toString() {
	return "funcionario [nome=" + nome + ", matricula=" + matricula + ", idade=" + idade + ", salario=" + salario + "]";
}
 
}

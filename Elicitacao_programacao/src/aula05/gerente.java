package aula05;

public class gerente extends funcionario{
protected int numfuncionariosgerenciados;

public int getNumfuncionariosgerenciados() {
	return numfuncionariosgerenciados;
}

public void setNumfuncionariosgerenciados(int numfuncionariosgerenciados) {
	this.numfuncionariosgerenciados = numfuncionariosgerenciados;
}
public void bonificar() {
	salario = salario + (salario * 0.15);
}

@Override
public String toString() {
	return "gerente [numfuncionariosgerenciados=" + numfuncionariosgerenciados + ", nome=" + nome + ", salario="
			+ salario + ", cpf=" + cpf + "]";
}

}

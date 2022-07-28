package desafio1;

public class Contas {
	public double resultado;
	public double Subtracao;
	public double Multiplicacao;
	public double Divisao;
	public void soma(double n1, double n2) {
		 resultado = n1 + n2;
		
}
   public void subtracao(double n1, double n2) {
	   Subtracao = n1-n2;
   }
   public void multiplicacao(double n1, double n2) {
	   Multiplicacao = n1*n2;
   }
   public void divisao(double n1, double n2) {
	   Divisao = n1 / n2;
   }
}

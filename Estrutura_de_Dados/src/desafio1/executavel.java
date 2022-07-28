package desafio1;

import javax.swing.JOptionPane;
public class executavel {

	public static void main(String[] args) {;
		valores n1 = new valores();
		n1.valor = Double.parseDouble

		        (JOptionPane.showInputDialog

		        (null, "escreva o primeiro valor"));
		valores n2 = new valores();
		n2.valor = Double.parseDouble

		        (JOptionPane.showInputDialog

		        (null, "Digite a primeira altura"));
		Contas conta = new Contas();
		conta.soma(n1.valor,n2.valor);
		conta.subtracao(n1.valor,n2.valor);
		conta.multiplicacao(n1.valor,n2.valor);
		conta.divisao(n1.valor,n2.valor);
		JOptionPane.showMessageDialog

	    (null, "a soma:"
	    +conta.resultado+ "\n"+
	    "a subtração:"
	    		+conta.Subtracao+ "\n"+
	    "a multiplicação:" 
	    + conta.Multiplicacao+ "\n" +
	    "a divisão:"
	    +conta.Divisao);

		
	}

}

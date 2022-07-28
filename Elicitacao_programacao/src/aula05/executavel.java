package aula05;

public class executavel {

	public static void main(String[] args) {
		gerente g1= new gerente();
		g1.setNome("dienefer");
        g1.setSalario(200000.00);
        g1.setCpf(231351);
		g1.setNumfuncionariosgerenciados(15);
		g1.bonificar();
		System.out.println(g1);
		

	}

}

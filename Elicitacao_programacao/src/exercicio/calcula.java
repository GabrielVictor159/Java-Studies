package exercicio;

public class calcula {
public double soma(double valor1, double valor2) {
	return valor1+valor2;
}
public double fatorial(int z) {
	int multiplica=1;
	int resultado=1;
	if(z>=1) {
	for(int i=1; i<=z; i++) {
		
		multiplica =multiplica *i;
		resultado = multiplica;
		
	}
	return resultado;
	}
	return 0;
}

}

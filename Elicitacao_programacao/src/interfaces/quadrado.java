package interfaces;

public class quadrado implements formageometrica {
protected double altura;

public double getAltura() {
	return altura;
}
public void setAltura(double altura) {
	this.altura = altura;
}
public double area() {
	return altura*altura;
}
public double comprimento() {
	return (altura*4);
}
}

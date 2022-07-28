package secretaria;
import java.util.Scanner;
import java.util.Random;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Executavel {

	public static void main(String[] args) {
		String data;
		Scanner leitura = new Scanner(System.in);
		Vetor lista = new Vetor();
		for(int i=0; i<2000; i++) {
			System.out.println("gostaria de continuar ? \n\n 1.sim \n 2.não");
			int variaveldecontinuidade=leitura.nextInt();
			if(variaveldecontinuidade==2){break;}
		System.out.println("-------------BOM DIA------------ \n o que gostaria de fazer ? \n\n 1-Registrar reclamação. \n 2-Excluir reclamação. \n 3-Consultar reclamação. \n 4-Registrar conserto. \n\n Digite um numero de 1 a 4.");
    int variaveldeacesso= leitura.nextInt();
    switch (variaveldeacesso) {
    case 1:
    	data = new SimpleDateFormat("yyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
    	 Random gerador = new Random();
 		int numero = gerador.nextInt(100000);
     	System.out.println("vamos fazer uma reclamação");
     	System.out.println("De 1 a 10 qual o tamanho do buraco ?");
     	int a=leitura.nextInt();
     	if(a>0 && a<=10) {
     	int buraco=a;
     	System.out.println("onde o buraco se encontra ? \n\n 1-Na rua ? \n 2-Na calçada ?");
     	a=leitura.nextInt();
     	if(a==1 || a==2) {
     		int localizacao=a;
     		
     		System.out.println("escreva sua rua");
     		String u = leitura.nextLine();
     		String rua = leitura.nextLine();
         	System.out.println("escreva o numero da casa:");
         	String numerocasa = leitura.nextLine();
         	System.out.println("escreva o seu bairro");
         	String bairro = leitura.nextLine();
         	Endereco E = new Endereco(rua, numerocasa, bairro);
         	Reclamacoes R= new Reclamacoes(numero, buraco, localizacao, data);
         	lista.adicionar(numero, R);
         	lista.adicionarendereco(numero, E);
         	System.out.println(""+R);
         	}
     	else {
     		System.out.println("valor invalido, por favor coloque um numero 1 ou 2");
     	}
     	}
     	else {
     		System.out.println("valor invalido, por favor coloque um numero de 1 a 10");
     	}
      break;
    case 2:
    	System.out.println("--------Ok vamos excluir a reclamação------ \n\n Por favor nos informe o numero da reclamação.");
    	int numerodeconsulta = leitura.nextInt();
    	if(lista.mostrar(numerodeconsulta)==null) {
    		System.out.println("não existe reclamação com esse numero");
    		break;
    	}
    	else {
    	lista.remover(numerodeconsulta);
    	System.out.println("Reclamação removida obrigado");
      break;
    	}
    case 3:
    	System.out.println("--------Ok vamos consultar uma reclamação------ \n\n Por favor nos informe o numero da reclamação.");
    	int numerodeconsulta2 = leitura.nextInt();
    	if(lista.mostrar(numerodeconsulta2)==null) {
    		System.out.println("não existe reclamação com esse numero");
    		break;
    	}
    	else {
    	System.out.println(""+lista.mostrar(numerodeconsulta2));
      break;
    	}
    case 4:
    	data = new SimpleDateFormat("yyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
    	System.out.println("--------Ok vamos registrar um concerto");
    	System.out.println("nos diga o numero da reclamação");
    	int numerodeconsulta3 = leitura.nextInt();
    	System.out.println("escreva o valor do concerto");
        double valor = leitura.nextDouble();  
        Concerto C = new Concerto(numerodeconsulta3, valor, data);
    	lista.adicionarconcerto(numerodeconsulta3, C);
    	System.out.println(""+C); 
      break;
   default:
	   System.out.println("valor invalido, por favor coloque um numero de 1 a 4");
	   break;
  }
	}
	}
}

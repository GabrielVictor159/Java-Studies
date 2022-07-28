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
			System.out.println("gostaria de continuar ? \n\n 1.sim \n 2.n�o");
			int variaveldecontinuidade=leitura.nextInt();
			if(variaveldecontinuidade==2){break;}
		System.out.println("-------------BOM DIA------------ \n o que gostaria de fazer ? \n\n 1-Registrar reclama��o. \n 2-Excluir reclama��o. \n 3-Consultar reclama��o. \n 4-Registrar conserto. \n\n Digite um numero de 1 a 4.");
    int variaveldeacesso= leitura.nextInt();
    switch (variaveldeacesso) {
    case 1:
    	data = new SimpleDateFormat("yyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
    	 Random gerador = new Random();
 		int numero = gerador.nextInt(100000);
     	System.out.println("vamos fazer uma reclama��o");
     	System.out.println("De 1 a 10 qual o tamanho do buraco ?");
     	int a=leitura.nextInt();
     	if(a>0 && a<=10) {
     	int buraco=a;
     	System.out.println("onde o buraco se encontra ? \n\n 1-Na rua ? \n 2-Na cal�ada ?");
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
    	System.out.println("--------Ok vamos excluir a reclama��o------ \n\n Por favor nos informe o numero da reclama��o.");
    	int numerodeconsulta = leitura.nextInt();
    	if(lista.mostrar(numerodeconsulta)==null) {
    		System.out.println("n�o existe reclama��o com esse numero");
    		break;
    	}
    	else {
    	lista.remover(numerodeconsulta);
    	System.out.println("Reclama��o removida obrigado");
      break;
    	}
    case 3:
    	System.out.println("--------Ok vamos consultar uma reclama��o------ \n\n Por favor nos informe o numero da reclama��o.");
    	int numerodeconsulta2 = leitura.nextInt();
    	if(lista.mostrar(numerodeconsulta2)==null) {
    		System.out.println("n�o existe reclama��o com esse numero");
    		break;
    	}
    	else {
    	System.out.println(""+lista.mostrar(numerodeconsulta2));
      break;
    	}
    case 4:
    	data = new SimpleDateFormat("yyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
    	System.out.println("--------Ok vamos registrar um concerto");
    	System.out.println("nos diga o numero da reclama��o");
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

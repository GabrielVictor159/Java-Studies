package secretaria;

public class Reclamacoes {
private int numero;
private int buraco;
private String localizacao;
private Endereco endereco;
private Concerto concerto;
private String data;
private String situacao;
public Concerto getConcerto() {
	return concerto;
}
public void setConcerto(Concerto concerto) {
	this.concerto = concerto;
	this.situacao="concerto realizado";
}
public Reclamacoes(int numero, int buraco, int localizacao,  String data) {
	this.situacao="ainda não resolvido";
	this.numero=numero;
	if(buraco<=10 && buraco>0) {
		this.buraco=buraco;
		if (localizacao == 1) {
			this.localizacao = "rua";
			
		}
		else if(localizacao == 2){
			this.localizacao = "calçada";
		
		}
		else {
			System.out.println("localização do buraco invalida");
		}
		this.data=data;
	}
	else {
		System.out.println("tamanho do buraco invalido");
	}
	
}
public String getData() {
	return data;
}
public void setData(String data) {
	this.data = data;
}

public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}
public Endereco getEndereco() {
	return endereco;
}
public void setEndereco(Endereco endereco) {
 	this.endereco = endereco;
}
public int getBuraco() {
	return buraco;
}
public void setBuraco(int buraco) {
	if(buraco<=10 || buraco>0) {
		this.buraco=buraco;
	}
	else {
		System.out.println("tamanho do buraco invalido");
	}
}
public String getLocalizacao() {
	return localizacao;
}
public void setLocalizacao(int localizacao) {
	if (localizacao == 1) {
		this.localizacao = "rua";
	}
	else if(localizacao == 2){
		this.localizacao = "calçada";
	}
	else {
		System.out.println("localição do buraco invalida");
	}
}
@Override
public String toString() {
	if(concerto == null) {
		return " Reclamação numero:" + numero+"\n data de criação da reclamação: "+data+"\n situação:" +situacao+"\n -----especificações do buraco-----"+"\n tamanho do buraco:"+buraco+"\n o buraco esta localizado na:"+localizacao+"\n"+endereco;
	}
	else {
		return " Reclamação numero:" + numero+"\n data de criação da reclamação: "+data+"\n situação:" +concerto+"\n -----especificações do buraco-----"+"\n tamanho do buraco:"+buraco+"\n o buraco esta localizado na:"+localizacao+"\n"+endereco;	
	}
}




}

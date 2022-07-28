package exemplo.io;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.File;
import java.io.FileNotFoundException;
public class EscreverArquivo2 {

	public static void main(String[] args) {
    try( FileOutputStream fos = new FileOutputStream("c:\\teste\\teste.txt"); 
    		OutputStreamWriter osw = new OutputStreamWriter(fos); 
    		BufferedWriter bw =new BufferedWriter(osw);) {
    	bw.write("teste teste");
    	System.out.println("Operação realizada com sucesso");
    } catch (FileNotFoundException e) {
    	e.printStackTrace();
    } catch (IOException e) {
    	e.printStackTrace();
    } 
    }
	}



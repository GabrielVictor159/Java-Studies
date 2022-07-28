package exemplo.io;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.File;
import java.io.FileNotFoundException;
public class EscreverArquivo {

	public static void main(String[] args) {
    FileOutputStream fos = null;		
    OutputStreamWriter osw = null;
    BufferedWriter bw = null;
    try {
    	fos = new FileOutputStream("c:\\teste\\teste.txt");
    	osw = new OutputStreamWriter(fos);
    	bw = new BufferedWriter(osw);
    	bw.write("teste teste");
    	System.out.println("Operação realizada com sucesso");
    } catch (FileNotFoundException e) {
    	e.printStackTrace();
    } catch (IOException e) {
    	e.printStackTrace();
    } finally {
    	try {
    		bw.close();
    		osw.close();
    		fos.close();
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    }
	}

}

package exemplo.io;
import java.io.File;
import java.io.IOException;
public class CriarArquivo {

	public static void main(String[] args) {
		File dir = new File("c://teste");
        if(dir.exists()) {
        	File arq = new File(dir, "teste.txt");
        	try {
        		arq.createNewFile();
        		System.out.println("arquivo criado com sucesso");
        	} catch (IOException e) {
        		e.printStackTrace();
        	}
        }
	}

}

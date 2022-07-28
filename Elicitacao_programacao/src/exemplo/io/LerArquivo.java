package exemplo.io;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
public class LerArquivo {
	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("c:\\teste\\test2.txt"); 
				InputStreamReader isr = new InputStreamReader(fis);
				BufferedReader br = new BufferedReader(isr);) {
		String linha = null;
		while((linha = br.readLine()) != null) {
			System.out.println(linha);
		}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

package exemplo.io;

import java.io.File;
import java.io.IOException;

public class CriarAquivov2 {

	public static void main(String[] args) {
		File arquivo = new File ("c:\\test\\teste2.txt");
		try {
			arquivo.createNewFile();
			System.out.println("Operação realizada com sucesso");
		} catch (IOException e){
			e.printStackTrace();
		}

	}

}

package exemplo.io;
import java.io.File;
public class CriacaoDiretorio {

	public static void main(String[] args) {
		File diretorio = new File("c:\\teste");
        boolean isCreate = diretorio.mkdir();
        if (isCreate) {
        	System.out.println("Diret�rio criado com sucesso");
        }
        else {
        	System.out.println("n�o foi possivel criar o diret�rio");
        }
	}

}

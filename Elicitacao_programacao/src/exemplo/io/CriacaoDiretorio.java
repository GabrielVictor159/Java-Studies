package exemplo.io;
import java.io.File;
public class CriacaoDiretorio {

	public static void main(String[] args) {
		File diretorio = new File("c:\\teste");
        boolean isCreate = diretorio.mkdir();
        if (isCreate) {
        	System.out.println("Diretório criado com sucesso");
        }
        else {
        	System.out.println("não foi possivel criar o diretório");
        }
	}

}

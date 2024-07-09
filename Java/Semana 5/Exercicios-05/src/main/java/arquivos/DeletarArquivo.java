package arquivos;

import java.io.File;

public class DeletarArquivo {
    public static void main(String[] args) {
        File arquivo = new File("src/main/java/arquivos/arquivo.txt");

        if (arquivo.delete()) {
            System.out.println("Arquivo deletado com sucesso.");
        } else {
            System.out.println("Não foi possível deletar o arquivo.");
        }
    }
}


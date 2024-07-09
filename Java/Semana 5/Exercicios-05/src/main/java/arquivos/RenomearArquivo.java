package arquivos;

import java.io.File;

public class RenomearArquivo {
    public static void main(String[] args) {
        File arquivoAntigo = new File("src/main/java/arquivos/arquivo.txt");
        File arquivoNovo = new File("src/main/java/arquivos/arquivo_novo.txt");

        if (arquivoAntigo.renameTo(arquivoNovo)) {
            System.out.println("Arquivo renomeado com sucesso.");
        } else {
            System.out.println("Não foi possível renomear o arquivo.");
        }
    }
}

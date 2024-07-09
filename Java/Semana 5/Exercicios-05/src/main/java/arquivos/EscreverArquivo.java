package arquivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class EscreverArquivo {
    public static void main(String[] args) {
        try {
            File arquivo = new File("src/main/java/arquivos/arquivo.txt");
            FileOutputStream fluxo = new FileOutputStream(arquivo);
            BufferedWriter escritor = new BufferedWriter(new OutputStreamWriter(fluxo));

            escritor.write("Hello World!");
            escritor.newLine();
            escritor.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


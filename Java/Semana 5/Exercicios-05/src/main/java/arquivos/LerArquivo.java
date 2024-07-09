package arquivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class LerArquivo {
    public static void main(String[] args) {
        try {
            File arquivo = new File("src/main/java/arquivos/arquivo.txt");
            FileInputStream fluxo = new FileInputStream(arquivo);
            BufferedReader leitor = new BufferedReader(new InputStreamReader(fluxo));

            String linha;
            while ((linha = leitor.readLine()) != null) {
                System.out.println(linha);
            }

            leitor.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


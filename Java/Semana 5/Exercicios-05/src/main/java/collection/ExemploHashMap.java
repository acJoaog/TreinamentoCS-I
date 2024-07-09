package collection;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("um", 1);
        mapa.put("dois", 2);
        mapa.put("três", 3);

        System.out.println("Valor associado à chave 'dois': " + mapa.get("dois"));
    }
}


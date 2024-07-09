package collection;

import java.util.Set;
import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {
        Set<String> conjuntoOrdenado = new TreeSet<>();
        conjuntoOrdenado.add("Z");
        conjuntoOrdenado.add("A");
        conjuntoOrdenado.add("B");

        for (String letra : conjuntoOrdenado) {
            System.out.println(letra);
        }
    }
}


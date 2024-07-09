package collection;

import java.util.HashSet;
import java.util.Set;

public class ExemploHashSet {
    public static void main(String[] args) {
        Set<String> conjunto = new HashSet<>();
        conjunto.add("A");
        conjunto.add("B");
        conjunto.add("C");
        conjunto.add("A"); // Duplicata, será ignorada

        for (String letra : conjunto) {
            System.out.println(letra);
        }
    }
}

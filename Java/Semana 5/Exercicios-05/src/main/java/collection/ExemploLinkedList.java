package collection;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        fila.add("Elemento 1");
        fila.add("Elemento 2");
        fila.add("Elemento 3");

        while (!fila.isEmpty()) {
            System.out.println(fila.poll());
        }
    }
}


package listaDuplamenteEncadeada;

import listaDuplamenteEncadeada.model.ListaDuplamenteEncadeada;

public class Main {

    public static void main(String[] args) {

        ListaDuplamenteEncadeada<String> minhaLista = new ListaDuplamenteEncadeada<>();

        minhaLista.add("c1");
        minhaLista.add("c2");
        minhaLista.add("c3");
        minhaLista.add("c4");
        minhaLista.add("c5");
        minhaLista.add("c6");

        System.out.println(minhaLista);
    }
}

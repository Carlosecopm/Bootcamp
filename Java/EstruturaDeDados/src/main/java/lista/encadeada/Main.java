package lista.encadeada;

import lista.encadeada.model.ListaEncadeada;

public class Main {
    public static void main(String[] args) {

        ListaEncadeada<String> minhaLista = new ListaEncadeada<>();

        minhaLista.add("teste1");
        minhaLista.add("teste2");
        minhaLista.add("teste3");
        minhaLista.add("teste4");

        System.out.println(minhaLista);
    }
}

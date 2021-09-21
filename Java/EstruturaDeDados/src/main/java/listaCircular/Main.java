package listaCircular;

import listaCircular.model.ListaCircular;

public class Main {

    public static void main(String[] args) {
        ListaCircular<String> minhaLista = new ListaCircular<>();

        minhaLista.add("c0");
        //System.out.println(minhaLista);
        minhaLista.add("c1");
        minhaLista.add("c2");
        //System.out.println(minhaLista);
        //System.out.println(minhaLista.get(0));

        for (int i = 0; i < 10; i++) {
            System.out.println(minhaLista.get(i));
        }
    }
}

package list;

import java.util.*;

public class ListExemplo {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.0);
        notas.add(6.0);
        notas.add(5.0);
        notas.add(9.0);
        notas.add(10.0);
        notas.add(3.0);
        System.out.println(notas.toString());
        System.out.println("posicao" + notas.indexOf(5d));
        //adiciona 9.0 na posicao 5
        notas.add(5, 9.0);
        //substitui valores na posicao
        notas.set(notas.indexOf(5d), 6.0);
        //verificar valor na lista
        notas.contains(5d);
        //passa a posicao e recebe o elemento
        notas.get(2);
        //menor nota
        Collections.min(notas);
        //maior nota
        Collections.max(notas);
        //somar valores
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        //media
        System.out.println("Media: " + (soma/notas.size()));
        //remove nota
        notas.remove(0d);
        //remover na posicao
        notas.remove(3);
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7 ) iterator1.remove();
        }
        //apaga toda a lista
        notas.clear();
        //cofere se está vazia
        notas.isEmpty();

    }

}

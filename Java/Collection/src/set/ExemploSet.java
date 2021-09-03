package set;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        Set<Double> notas = new HashSet<>(Arrays.asList(7d,8.0,3d,4.0,2.0,10.0,9d,7d));
        System.out.println(notas);
        //verificar se contem o valor
        notas.contains(7d);
        //menor valor
        Collections.min(notas);
        //maior valor
        Collections.max(notas);
        //somar os valores
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma" + soma);
        //media
        System.out.println("Media" + (soma / notas.size()));
        //remover valor
        notas.remove(10d);
        //remover menor que 7
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7 ) iterator1.remove();
        }
        System.out.println(notas);
        //imprimir na ordem de inserção
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.0);
        notas2.add(2d);
        System.out.println(notas2);
        //ordem crescente
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);
        //apaga tudo
        notas.clear();
        //verificar se está vazio
        notas2.isEmpty();
    }
}

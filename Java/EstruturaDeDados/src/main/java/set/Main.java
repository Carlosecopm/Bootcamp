package set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set<Carro> setCarros = new HashSet<>();

        setCarros.add(new Carro("Ford"));
        setCarros.add(new Carro("Chevolet"));
        setCarros.add(new Carro("Fiat"));
        setCarros.add(new Carro("Peugeot"));
        setCarros.add(new Carro("Zip"));
        setCarros.add(new Carro("Alfa Romeu"));

        System.out.println(setCarros);

        Set<Carro> treeSetCarros = new TreeSet<>();
        treeSetCarros.add(new Carro("Ford"));
        treeSetCarros.add(new Carro("Chevolet"));
        treeSetCarros.add(new Carro("Fiat"));
        treeSetCarros.add(new Carro("Peugeot"));
        treeSetCarros.add(new Carro("Zip"));
        treeSetCarros.add(new Carro("Alfa Romeu"));

        System.out.println(treeSetCarros);
    }
}

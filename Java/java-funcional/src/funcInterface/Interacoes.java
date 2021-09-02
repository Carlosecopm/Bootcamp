package funcInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Interacoes {
    public static void main(String[] args) {
        String[] nomes = {"Carlos","Luiz","dos","Santos","Silva"};
        Integer[] numeros = {1,2,3,4};
        //imprimirNomesFiltrados(nomes);
        //imprimirTodos(nomes);
        //imprimirNumeros(numeros);
        List<String> lista = new ArrayList<>();
        lista.add("Desenvolvedor");
        lista.add("Analista");
        lista.add("Teste");
        lista.add("Teste Unitario");

        lista.stream()
                .filter(teste -> teste.startsWith("Teste"))
                .forEach(System.out::println);
    }
    public static void imprimirNomesFiltrados(String... nomes) {
        String nomesParaImprimir = "";
        for (int i = 0; i < nomes.length; i++ ) {
            if (nomes[i].equals("Carlos")){
                nomesParaImprimir +=""+nomes[i];
            }
        }
        System.out.println("for "+nomesParaImprimir);
        String nomesParaImprimirStream = Stream.of(nomes)
                .filter(nome -> nome.equals("Carlos"))
                .collect(Collectors.joining());
        System.out.println("Stream "+nomesParaImprimirStream);
    }
    public static void imprimirTodos(String... nomes) {
        for (String nome: nomes) {
            System.out.println("for "+nome);
        }
        Stream.of(nomes)
                .forEach(nome -> System.out.println(nome));
    }
    public static void imprimirNumeros(Integer... numeros) {
        for (Integer numero: numeros) {
            System.out.println(numero*2);
        }
        Stream.of(numeros).map(numero -> numero*2)
                .forEach(System.out::println);
    }
}

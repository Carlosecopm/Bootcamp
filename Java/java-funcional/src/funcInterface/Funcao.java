package funcInterface;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        Function<String, String> inverteNome = texto -> new StringBuilder(texto).reverse().toString();
        System.out.println(inverteNome.apply("Carlos"));
        Function<String , Integer> converterStringInt = string -> Integer.valueOf(string) * 2;
        System.out.println(converterStringInt.apply("20"));
    }
}

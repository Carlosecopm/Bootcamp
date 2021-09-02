package funcInterface;

import java.util.function.Consumer;

public class Consumidores {
    public static void main(String[] args) {
        Consumer<String> imprimirMensagem = System.out::println;
        //Consumer<String> imprimirMensagem = frase -> System.out.println(frase);
        imprimirMensagem.accept("Ola Mundo!!");
    }
}

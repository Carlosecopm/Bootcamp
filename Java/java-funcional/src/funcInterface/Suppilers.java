package funcInterface;

import java.util.function.Supplier;

public class Suppilers {
    public static void main(String[] args) {
        Supplier<Pessoa> supplier = () -> new Pessoa();
        System.out.println(supplier.get());
    }
}

class Pessoa {
    private String nome;
    private Integer idade;

    public Pessoa() {
        nome = "Carlos";
        idade = 30;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}

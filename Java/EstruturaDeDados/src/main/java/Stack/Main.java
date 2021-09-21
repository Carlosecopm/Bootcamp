package Stack;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Carro> pilhaCarro = new Stack<>();

        pilhaCarro.push(new Carro("Ford"));
        pilhaCarro.push(new Carro("Chevrolet"));
        pilhaCarro.push(new Carro("Fiat"));

        System.out.println(pilhaCarro);
        System.out.println(pilhaCarro.pop());
        System.out.println(pilhaCarro);

        System.out.println(pilhaCarro.peek());
        System.out.println(pilhaCarro);

        System.out.println(pilhaCarro.empty());
    }
}

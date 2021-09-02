package com.company;

/*public class FuncaoComLambda {
    public static void main(String[] args) {
        Funcao colocarPerfixoString = valor -> "Sr. "+valor;
        System.out.println(colocarPerfixoString.gerar("Joao"));
    }
}
interface Funcao {
    String gerar(String valor);
}
*/
public class FuncaoComLambda {
    public static void main(String[] args) {
        Funcao1 funcao1 = valor -> {
            System.out.println(valor);
            System.out.println(valor);
            return valor;
        };
        funcao1.gerar("Joao");
    }
}
interface Funcao1 {
    String gerar(String valor);
}
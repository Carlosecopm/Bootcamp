package com.company;

import java.util.function.BiPredicate;

public class FuncoesPura {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> verificarSeMaior =
                (parametro, valorComparacao) -> parametro > valorComparacao;

        System.out.println(verificarSeMaior.test(13,12));

    }
}

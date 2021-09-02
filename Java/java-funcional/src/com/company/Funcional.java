package com.company;

import java.util.function.UnaryOperator;

public class Funcional {
    public static void main(String[] args) {
        UnaryOperator<Integer> calculaValorVezes3 = valor -> valor * 3;
        int valor = 10;
        System.out.println("O resultado é: " + calculaValorVezes3.apply(10));
    }
}

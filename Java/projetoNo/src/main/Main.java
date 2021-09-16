package main;

import com.projetono.No;

public class Main {
    public static void main(String[] args) {
        No<String> no1 = new No<String>("Conteudo no1");

        No<String> no2 = new No<String>("Conteudo no2");
         no1.setProximo(no2);
        No<String> no3 = new No<String>("Conteudo no3");
        no2.setProximo(no3);

        System.out.println(no1);
    }
}

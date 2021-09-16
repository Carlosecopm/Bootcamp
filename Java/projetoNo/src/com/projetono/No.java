package com.projetono;

import java.util.Objects;

public class No<T> {
    private T conteudo;
    private No<T> proximo;

    public No( T conteudo) {
        this.conteudo = conteudo;
        this.proximo = null;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        No no = (No) o;
        return Objects.equals(conteudo, no.conteudo) && Objects.equals(proximo, no.proximo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conteudo, proximo);
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}

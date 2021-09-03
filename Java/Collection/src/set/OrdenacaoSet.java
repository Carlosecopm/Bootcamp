package set;

import java.util.*;

public class OrdenacaoSet {
    public static void main(String[] args) {
        Set<Series> minhasSeries = new HashSet<>(){{
            add(new Series("got", "fantasia", 60));
            add(new Series("dack", "drama", 60));
            add(new Series("that '70s show", "comedia", 25));
        }};
        for (Series series: minhasSeries ){
            System.out.println(series.getNome() + " - "+ series.getGenero() + " - "+ series.getTempoEpisodio());
        }
        //ordem de inserção
        Set<Series> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Series("got", "fantasia", 60));
            add(new Series("dack", "drama", 60));
            add(new Series("that '70s show", "comedia", 25));
        }};
        for (Series series: minhasSeries1 ){
            System.out.println(series.getNome() + " - "+ series.getGenero() + " - "+ series.getTempoEpisodio());
        }
        //Ordem natural (episodio)
        Set<Series> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Series series: minhasSeries2 ){
            System.out.println(series.getNome() + " - "+ series.getGenero() + " - "+ series.getTempoEpisodio());
        }
        Set<Series> minhasSeries3 = new TreeSet<>( new ComparatorNomeGeneroTempo());
        minhasSeries3.addAll(minhasSeries);
        for (Series series: minhasSeries3){
            System.out.println(series.getNome() + " - "+ series.getGenero() + " - "+ series.getTempoEpisodio());
        }
    }
}

class Series implements Comparable<Series>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Series(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    public void setTempoEpisodio(Integer tempoEpisodio) {
        this.tempoEpisodio = tempoEpisodio;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Series series = (Series) o;
        return Objects.equals(nome, series.nome) && Objects.equals(genero, series.genero) && Objects.equals(tempoEpisodio, series.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Series series) {

        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), series.getTempoEpisodio());
        if (tempoEpisodio !=0 ) return tempoEpisodio;
        return this.getGenero().compareTo(series.getGenero());

    }
}

class ComparatorNomeGeneroTempo implements Comparator<Series> {

    @Override
    public int compare(Series s1, Series s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0 ) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0 ) return genero;

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}
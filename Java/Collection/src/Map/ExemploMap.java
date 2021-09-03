package Map;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
        }};
        System.out.println(carrosPopulares.toString());
        //substituir valor
        carrosPopulares.put("gol", 16.1);
        //buscar chave
        carrosPopulares.containsKey("tucsun");
        //buscar valor
        carrosPopulares.get("uno");
        //Exibir os modelos
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);
        //exibir consumo
        Collection<Double> consumo = carrosPopulares.values();
        System.out.println(consumo);
        //maior valor
        Double maisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry: entries) {
            if (entry.getValue().equals(maisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("Mais eficiente: " + modeloMaisEficiente + " - " + maisEficiente);

            }
        }
        //modelo menos econômico
        Double menosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry: carrosPopulares.entrySet()) {
            if (entry.getValue().equals(menosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: "+ modeloMenosEficiente + " - " + menosEficiente);
            }
        }
        //soma dos consumos
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("Soma: " + soma);
        //media
        System.out.println("Media: " + (soma / carrosPopulares.size()));
        // remover acima de 15.4
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()) {
           if (iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println("Ficou: " + carrosPopulares);
        //exibir na ordem de inserção
        Map<String, Double> carrosPopulares1 = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
        }};
        System.out.println(carrosPopulares1);
        //Ordenar modelo
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());
        //apagar tudo
        carrosPopulares.clear();
        //verificar se vazio
        carrosPopulares.isEmpty();
    }
}

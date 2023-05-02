package com.medeiros.SPRINGProject.utils;

import java.util.*;

public class hashMapFunctions {
    public static HashMap<String, Integer> ordenarHashMapPorValor(HashMap<String, Integer> hashMap) {
        List<Map.Entry<String, Integer>> list = new LinkedList<>(hashMap.entrySet());

        // Ordena a lista de acordo com os valores dos elementos do mapa em ordem decrescente
        list.sort(new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        // Cria um LinkedHashMap a partir da lista ordenada
        HashMap<String, Integer> sortedHashMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }

        return sortedHashMap;
    }

}

package org.example.hwnumber3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
Задача 3
Объединение 2 списков и удаление дубликатов
 */

public class App2 {
    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList<>(List.of(List.of(1, 2, 3,4), List.of(4, 5, 6), List.of(7, 8,9, 9)));
        lists.stream()
                .flatMap(Collection::stream)
                .distinct()
                .forEach(System.out::println);
    }
}

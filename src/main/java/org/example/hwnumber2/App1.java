package org.example.hwnumber2;

import java.util.ArrayList;
import java.util.List;
/*
Задача 2
Количество слов в тексте, начинающихся на букву 'A'
 */

public class App1 {
    public static void main(String[] args) {
        List<String> name = List.of("Anna","Andrey","Olesya","Evgenyi");
        name.stream()
                .filter(s->s.startsWith("A"))
                .toList().forEach(System.out::println);
    }
}

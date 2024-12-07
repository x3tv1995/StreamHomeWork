package org.example.hwnumber5;

import java.util.ArrayList;
import java.util.List;
/*
Задача 5
Пропустить первые 3 элемента в стриме чисел и собрать оставшиеся в список.
 */

public class App4 {
    public static void main(String[] args) {
        List<Integer> digits = new ArrayList<Integer>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16));
        List<Integer> digitSkip3 = digits.stream()
                .skip(3)
                .toList();
        System.out.println(digitSkip3);

    }
}

package org.example.hwnumbers6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/*
Задача 6
Разделить список чисел на две группы: четные и нечетные, и получить мапу с ключами "even" и "odd".
 */

public class App5 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        String even = "even";
        String odd = "odd";
    Map<String, List<Integer>> map = list.stream()

                .collect(Collectors.groupingBy(s->{
                        if(s % 2 == 0) {
                            return even;
                        } else{
                            return odd;
                        }

                }));
        System.out.println(map);

    }
}

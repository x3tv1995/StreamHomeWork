package org.example.hwnumber7;

import java.util.ArrayList;
import java.util.List;

/*Удалить дубликаты из списка строк и получить результат в виде массива строк.*/

public class App6 {
    public static void main(String[] args) {
        List<String> listStr = new ArrayList<String>(List.of("Bmw","Audi","Mercedes","Bmw","Lada","Audi"));

      String[] array=  listStr.stream()
                .distinct()
                .toArray(String[]::new);

    }
}

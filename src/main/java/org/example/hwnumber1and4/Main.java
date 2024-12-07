package org.example.hwnumber1and4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/*
Задача 1
создать класс Человек прописать свойства имя пол возраст
добавить в лист
после вывести Средний возраст среди женщин старше 25
 */

/*
Задача 4
Лист из задачи 1
Группировка по возрасту в мап
 */
public class Main {
    public static void main(String[] args) {
        List<Human> listHuman = new ArrayList<Human>();
        listHuman.add(new Human("Alex",21,"m"));
        listHuman.add(new Human("Maria",21,"w"));
        listHuman.add(new Human("Charlie",23,"m"));
        listHuman.add(new Human("Olga",26,"w"));


     // решение 1 задачи
Double oldHuman =   listHuman.stream()
                .filter(s->s.getAge()>25 && s.getSex().equals("w"))
             .collect(Collectors.averagingDouble(Human::getAge));
        System.out.println(oldHuman);


        //решение 4 задачи

        Map<Integer, List<Human>> collect = listHuman.stream()
                .collect(Collectors.groupingBy(Human::getAge));
        System.out.println(collect);

    }
}

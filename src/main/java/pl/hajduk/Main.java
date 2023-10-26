package pl.hajduk;

import pl.hajduk.task1and2.Sorting;
import pl.hajduk.task3.MapTask;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Sorting sorting = new Sorting();
        List<String> list = List.of("Zzzz", "Abca", "abc", "cba", "zZaa", "banan");
        System.out.println(sorting.stringSort(list));
        System.out.println("*********");
        System.out.println(sorting.stringSortIgnoreCase(list));
        System.out.println("*****ZAD 3******");
        MapTask mapTask = new MapTask();
        Map<String, Integer> map = Map.of(
                "Java", 18,
                "Python", 1,
                "PHP", 0);

        System.out.println(mapTask.mapKey(map));


    }

}
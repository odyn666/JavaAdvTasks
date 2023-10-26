package pl.hajduk.task1and2;

import java.util.Comparator;
import java.util.List;

public class Sorting {

    public List<String> stringSort(List<String> list) {


        return list.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
    }

    public List<String> stringSortIgnoreCase(List<String> list) {


        return list.stream()
                .map(String::toLowerCase)
                .sorted(Comparator.reverseOrder())
                .toList();
    }
}

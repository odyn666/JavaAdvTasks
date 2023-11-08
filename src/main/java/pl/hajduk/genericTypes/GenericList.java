package pl.hajduk.genericTypes;

import java.util.ArrayList;
import java.util.List;

public class GenericList<T> {
    private final List<T> list;

    public GenericList() {
        this.list = new ArrayList<>();
    }

    boolean add(T t) {
        return list.add(t);
    }

    boolean remove(T t) {
        return list.remove(t);
    }

    void display() {
        System.out.println(list);
    }
}

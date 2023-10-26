package pl.hajduk.task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {
    private final Map<String, List<String>> storage;

    public Storage() {
        storage = new HashMap<>();
    }

    public void addToStorage(String k1, String v1) {

        boolean containsKey = storage.containsKey(k1);
        if (containsKey) {
            List<String> value = storage.get(k1);
            value.add(v1);
        } else {
            List<String> newValue = new ArrayList<>();
            newValue.add(v1);
            storage.put(k1, newValue);
        }
        System.out.println(storage);

    }

    public void printValues(String key) {
        if (storage.containsKey(key)) {
            System.out.println("values: " + storage.get(key));
        } else {
            System.out.println("key does not exists");
        }
    }

    public void findValues(String value) {
        for (Map.Entry<String, List<String>> m : storage.entrySet()) {

//            String containsKey=m.getKey();
            List<String> currentValue = m.getValue();
            if (currentValue.contains(m.getKey())) {
                System.out.println("found:" + m.getValue());
            } else {
                System.out.println((String) null);
            }

        }
    }
}

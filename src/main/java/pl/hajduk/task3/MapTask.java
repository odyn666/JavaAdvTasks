package pl.hajduk.task3;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapTask {

    public String mapKey(Map<String,Integer>map)
    {
        Function<Map.Entry<String,Integer>,String>mapper=e->"klucz:"+e.getKey()+","+e.getValue();

        return map.entrySet().stream().map(mapper).collect(Collectors.joining(",\n","","."));

    }
}

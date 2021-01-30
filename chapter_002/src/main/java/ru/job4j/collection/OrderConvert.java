package ru.job4j.collection;

import java.util.HashMap;
import java.util.List;

public class OrderConvert {
    public HashMap<String, Order> process(List<Order> orders) {
        HashMap<String, Order> map = new HashMap<>();
        for (Order x : orders) {
            map.put(x.getNumber(), x);
        }
        return map;
    }
}

package ru.job4j.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

public class OrderConvertTest {
    @Test
    public void processTest() {
        Order order = new Order("321", "qwerty");
        List<Order> orders = new ArrayList<>();
        orders.add(order);
        OrderConvert test = new OrderConvert();
        HashMap<String, Order> map = test.process(orders);
        assertThat(map.get("321"), is(order));
    }
}

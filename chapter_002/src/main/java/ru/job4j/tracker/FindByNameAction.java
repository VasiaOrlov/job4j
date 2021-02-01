package ru.job4j.tracker;

import java.util.List;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Найти заявку по имени ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        List<Item> result = tracker.findByName(input.askStr("Введите имя заявки: "));
        System.out.println("Список заявок:");
        int value = 0;
        for (Item x : result) {
            System.out.println(value++ + ". " + x.getName() + ", id = " + x.getId());
        }
        return true;
    }
}

package ru.job4j.tracker;

import java.util.List;

public class FindAllAction implements UserAction {
    @Override
    public String name() {
        return "=== Показать все заявки ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        List<Item> result = tracker.findAll();
        System.out.println("Список заявок:");
        if (result.size() == 0) {
            System.out.println("Список пуст.");
        } else {
            int value = 0;
            for (Item x : result) {
                System.out.println(String.format("%d. %s, id = %s", value++, x.getName(), x.getId()));
            }
        }
        return true;
    }
}

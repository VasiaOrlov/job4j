package ru.job4j.tracker;

public class FindAllAction implements UserAction {
    @Override
    public String name() {
        return "=== Показать все заявки ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] result = tracker.findAll();
        System.out.println("Список заявок:");
        if (result.length == 0) {
            System.out.println("Список пуст.");
        } else {
            for (int index = 0; index < result.length; index++) {
                System.out.println(String.format("%d. %s, id = %s", index, result[index].getName(), result[index].getId()));
            }
        }
        return true;
    }
}

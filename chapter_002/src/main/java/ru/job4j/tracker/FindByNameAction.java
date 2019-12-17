package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Найти заявку по имени ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] result = tracker.findByName(input.askStr("Введите имя заявки: "));
        System.out.println("Список заявок:");
        for (int index = 0; index < result.length; index++) {
            System.out.println(index + ". " + result[index].getName() + ", id = " + result[index].getId());
        }
        return true;
    }
}

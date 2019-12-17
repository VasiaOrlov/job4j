package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "=== Изменить заявку ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        if (tracker.replace(input.askStr("Введите id: "), new Item(input.askStr("Введите новое имя: ")))) {
            System.out.println("Заявка изменена.");
        } else {
            System.out.println("Заявка не найднна.");
        }
        return true;
    }
}

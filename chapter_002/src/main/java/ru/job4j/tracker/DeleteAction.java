package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "=== Удалить заявку ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        if (tracker.delete(input.askStr("Ведите id заявки чтобы удалить: "))) {
            System.out.println("Заявка удалена.");
        } else {
            System.out.println("Заявка не найдена.");
        }
        return true;
    }
}

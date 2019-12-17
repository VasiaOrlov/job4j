package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "=== Найти заявку по Id ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Введите id чтобы найти заявку: ");
        if (tracker.findById(id) != null) {
            System.out.println("Заявка с данным id: " + tracker.findById(id).getName());
        } else {
            System.out.println("Заявки с таким id не существует.");
        }
        return true;
    }
}

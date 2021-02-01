package ru.job4j.tracker;
import java.util.ArrayList;
import java.util.List;

public class StartUI {

    public static void createItem(Input input, Tracker tracker) {
        tracker.add(new Item(input.askStr("Введите имя заявки: ")));
    }

    public static void findAllItem(Tracker tracker) {
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
    }

    public static void replaceItem(Input input, Tracker tracker) {
        if (tracker.replace(input.askStr("Введите id: "), new Item(input.askStr("Введите новое имя: ")))) {
            System.out.println("Заявка изменена.");
        } else {
            System.out.println("Заявка не найднна.");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        if (tracker.delete(input.askStr("Ведите id заявки чтобы удалить: "))) {
            System.out.println("Заявка удалена.");
        } else {
            System.out.println("Заявка не найдена.");
        }
    }

    public static void findByIdItem(Input input, Tracker tracker) {
        String id = input.askStr("Введите id чтобы найти заявку: ");
        if (tracker.findById(id) != null) {
            System.out.println("Заявка с данным id: " + tracker.findById(id).getName());
        } else {
            System.out.println("Заявки с таким id не существует.");
        }
    }

    public static void findByNameItem(Input input, Tracker tracker) {
        List<Item> result = tracker.findByName(input.askStr("Введите имя заявки: "));
        System.out.println("Список заявок:");
        int value = 0;
        for (Item x : result) {
            System.out.println(value++ + ". " + x.getName() + ", id = " + x.getId());
        }
    }

    public static boolean exit() {
        System.out.println("Досвидания");
        return false;
    }

    public static void replay() {
        System.out.println("Введите значение от 0 до 6.");
    }

    public void init(Input input, Tracker tracker, List<UserAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ", actions.size());
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(List<UserAction> actions) {
        System.out.println("Menu.");
        int value = 0;
        for (UserAction x : actions) {
            System.out.println(value++ + ". " + x.name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Input validate = new ValidateInput(input);
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>();
        actions.add(new CreateAction());
        actions.add(new FindAllAction());
        actions.add(new ReplaceAction());
        actions.add(new DeleteAction());
        actions.add(new FindByIdAction());
        actions.add(new FindByNameAction());
        actions.add(new ExitAction());
        new StartUI().init(validate, tracker, actions);
    }
}

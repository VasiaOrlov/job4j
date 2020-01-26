package ru.job4j.tracker;

public class StartUI {

    public static void createItem(Input input, Tracker tracker) {
        tracker.add(new Item(input.askStr("Введите имя заявки: ")));
    }

    public static void findAllItem(Tracker tracker) {
        Item[] result = tracker.findAll();
        System.out.println("Список заявок:");
        if (result.length == 0) {
            System.out.println("Список пуст.");
        } else {
            for (int index = 0; index < result.length; index++) {
                System.out.println(String.format("%d. %s, id = %s", index, result[index].getName(), result[index].getId()));
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
        Item[] result = tracker.findByName(input.askStr("Введите имя заявки: "));
        System.out.println("Список заявок:");
        for (int index = 0; index < result.length; index++) {
            System.out.println(index + ". " + result[index].getName() + ", id = " + result[index].getId());
        }
    }

    public static boolean exit() {
        System.out.println("Досвидания");
        return false;
    }

    public static void replay() {
        System.out.println("Введите значение от 0 до 6.");
    }

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ", actions.length);
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Input validate = new ValidateInput(input);
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(),
                new FindAllAction(),
                new ReplaceAction(),
                new DeleteAction(),
                new FindByIdAction(),
                new FindByNameAction(),
                new ExitAction()
        };
        new StartUI().init(validate, tracker, actions);
    }
}

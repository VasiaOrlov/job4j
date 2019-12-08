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

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int value = Integer.valueOf(input.askStr("Select: "));
            if (value == 0) {
                StartUI.createItem(input, tracker);
            } else if (value == 1) {
                StartUI.findAllItem(tracker);
            } else if (value == 2) {
                StartUI.replaceItem(input, tracker);
            } else if (value == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (value == 4) {
                StartUI.findByIdItem(input, tracker);
            } else if (value == 5) {
                StartUI.findByNameItem(input, tracker);
            } else if (value == 6) {
                run = StartUI.exit();
            } else {
                StartUI.replay();
            }
        }
    }
    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }
    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}

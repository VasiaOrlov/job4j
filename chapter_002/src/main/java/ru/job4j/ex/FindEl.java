package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = 0;
        for (String val : value) {
            if (key.equals(val)) {
                break;
            } else {
                rsl++;
            }
        }
        if (rsl == value.length) {
            throw new ElementNotFoundException("Данный элемент не найден");
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            System.out.println(indexOf(new String[]{"vasia", "sasha", "kolia"}, "petr"));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}

package ru.job4j.tracker;

import java.util.Random;
import java.util.Arrays;

/**
 * Class Tracker.
 * @author Vasiliy Orlov.
 */
public class Tracker {
    private final Item[] items = new Item[100];
    private int position = 0;

    /**
     * Method add - добавляет заявку в массив.
     * @param item - заявка.
     * @return - входящую заявкую
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Method delete - удаляет заявку из массива.
     * @param id - уникальный номер заявки.
     * @return - ответ, была ли удалена заявка из массива.
     */
    public boolean delete(String id) {
        boolean result = false;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                System.arraycopy(items, index + 1, items, index, position - index - 1);
                items[position - 1] = null;
                position--;
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Method replace - редактирует заявку с данным уникальным номером.
     * @param id - уникальный номер заявки.
     * @param item - отредактированая заявка.
     * @return - ответ, была ли отредактирована заявка в массиве.
     */
    public boolean replace(String id, Item item) {
        boolean result = false;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                items[index] = item;
                items[index].setId(id);
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Method findAll - выдает все заявки которые есть.
     * @return - массив заполненых заявок.
     */
    public Item[] findAll() {
        Item[] result = new Item[position];
        for (int index = 0; index < position; index++) {
            result[index] = items[index];
        }
        return result;
    }

    /**
     * Method findByName ищет заявки по имени.
     * @param key - name заявки которую ищем.
     * @return - массив заявок с name = name.
     */
    public Item[] findByName(String key) {
        Item[] result = new Item[position];
        int value = 0;
        for (int index = 0; index < position; index++) {
            if (items[index].getName().equals(key)) {
                result[value] = items[index];
                value++;
            }
        }
        return Arrays.copyOf(result, value);
    }

    /**
     * Method findById - ищет заявку по уникальному номеру заявки.
     * @param id - уникальный номер заявки.
     * @return - заявку с данным id.
     */
    public Item findById(String id) {
        Item result = null;
        for (int index = 0; index < position; index++) {
            if (items[index] != null && items[index].getId().equals(id)) {
                result = items[index];
                break;
            }
        }
        return result;
    }

    /**
     * Method generateId - генерирует уникальный номер заявки.
     * @return уникальный номер заявки.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }
}

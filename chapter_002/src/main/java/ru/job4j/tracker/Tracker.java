package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;
import java.util.List;

/**
 * Class Tracker.
 * @author Vasiliy Orlov.
 */
public class Tracker {
    private final List<Item> items = new ArrayList<>();

    /**
     * Method add - добавляет заявку в массив.
     * @param item - заявка.
     * @return - входящую заявкую
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items.add(item);
        return item;
    }

    /**
     * Method delete - удаляет заявку из массива.
     * @param id - уникальный номер заявки.
     * @return - ответ, была ли удалена заявка из массива.
     */
    public boolean delete(String id) {
        boolean result = false;
        for (Item x : items) {
            if (x.getId().equals(id)) {
                items.remove(x);
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
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId().equals(id)) {
                items.set(index, item);
                item.setId(id);
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
    public List<Item> findAll() {
        return items;
    }

    /**
     * Method findByName ищет заявки по имени.
     * @param key - name заявки которую ищем.
     * @return - массив заявок с name = name.
     */
    public List<Item> findByName(String key) {
        List<Item> result = new ArrayList<>();
        for (Item x : items) {
            if (x.getName().equals(key)) {
                result.add(x);
            }
        }
        return result;
    }

    /**
     * Method findById - ищет заявку по уникальному номеру заявки.
     * @param id - уникальный номер заявки.
     * @return - заявку с данным id.
     */
    public Item findById(String id) {
        Item result = null;
        for (Item x : items) {
            if (x.getId().equals(id)) {
                result = x;
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

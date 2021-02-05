package ru.job4j.tracker;

/**
 * Class Item.
 * @author Vasiliy Orlov.
 */
public class Item implements Comparable<Item> {
    /**
     * id - уникальный номер заявки.
     * name - имя заявки.
     */
    private String id;
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Item o) {
        return Integer.compare(Integer.parseInt(id), Integer.parseInt(o.getId()));
    }

    @Override
    public String toString() {
        return "Item{"
                + "id='" + id + '\''
                + ", name='" + name + '\''
                + '}';
    }
}

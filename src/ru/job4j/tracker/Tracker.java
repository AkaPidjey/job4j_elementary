package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод добавления заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(generateId());
        items[position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        //Реализовать метод генерации.
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    /**
     * Метод для получения всех заявок.
     * Метод public Item[] findAll() возвращает копию массива this.items без null элементов (без пустых клеток)
     * @return обрезанный массив namesWithoutNull.
     */
    public Item[] findAll() {
        Item[] namesWithoutNull = new Item[items.length];
        int size = 0;
        for (int index = 0; index < items.length; index++) {
            Item item = items[index];
            if (item != null) {
                namesWithoutNull[size] = item;
                size++;
            }
        }
        namesWithoutNull = Arrays.copyOf(namesWithoutNull, size);
        return namesWithoutNull;
    }

    /**
     *Метод public Item[] findByName(String key) проверяет в цикле все элементы массива this.items,
     * сравнивая name (используя метод getName класса Item) с аргументом метода String key.
     * Элементы, у которых совпадает name, копирует в результирующий массив и возвращает его.
     * Алгоритм этого метода аналогичен методу findAll.
     * @return обрезанный массив namesEqualsKey.
     */
    public Item[] findByName(String key) {
        Item[] namesEqualsKey = new Item[items.length];
        int size = 0;
        for (int index = 0; index < items.length; index++) {
            Item item = items[index];
            if (item.getName().equals(key)) {
                namesEqualsKey[size] = item;
                size++;
            }
        }
        namesEqualsKey = Arrays.copyOf(namesEqualsKey, size);
        return namesEqualsKey;
    }

    /**
     * Метод public Item findById(String id) проверяет в цикле все элементы массива this.items,
     * сравнивая id с аргументом String id и возвращает найденный Item. Если Item не найден - возвращает null.
     * @return возвращает найденный Item.
     */
    public Item findById(String id) {
        Item tmp = new Item();
        for (int index = 0; index < items.length; index++) {
            Item item = items[index];
            if (item.getId().equals(id)) {
                tmp = item;
                break;
            }
        }
        return tmp;
    }
}

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
     * @return item новую созданную заявку
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
     * @return копию обрезанного массива items.
     */
    public Item[] findAll() {
        return Arrays.copyOf(items, position);
    }

    /**
     *Метод public Item[] findByName(String key) проверяет в цикле все элементы массива this.items,
     * сравнивая name (используя метод getName класса Item) с аргументом метода String key.
     * Элементы, у которых совпадает name, копирует в результирующий массив и возвращает его.
     * Алгоритм этого метода аналогичен методу findAll.
     * @return обрезанный массив namesEqualsKey.
     */
    public Item[] findByName(String key) {
        Item[] namesEqualsKey = new Item[position];
        int size = 0;
        for (int index = 0; index < position; index++) {
            Item item = items[index];
            if (item.getName().equals(key)) {
                namesEqualsKey[size] = item;
                size++;
            }
        }
        return Arrays.copyOf(namesEqualsKey, size);
    }

    /**
     * Метод public Item findById(String id) проверяет в цикле все элементы массива this.items,
     * сравнивая id с аргументом String id и возвращает найденный Item. Если Item не найден - возвращает null.
     * @return возвращает найденный Item или 0, если значение не найдено.
     */
    // Упрощаем метод findById на основе метода indexOf
    public Item findById(String id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }
/*
    public Item findById(String id) {
        Item tmp = null;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                tmp = items[index];
                break;
            }
        }
        return tmp;
    }
*/
    /**
     * Метод для поиска заявки по id.
     * private int indexOf(String id) возвращает index записи совпадающей с id. Или -1, если нет совпадений.
     * @return rsl
     */
    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    /**
     * Метод для замены заявки.
     * public boolean replace(String id, Item item) находит заявку по id и дальше в этой заявке заменяет запись,
     * оставляя старый id. Если id не найден метод возвращает false и сообщение об этом.
     * @return result
     */
    public boolean replace(String id, Item item) {
        int index = indexOf(id);
        boolean result = true;
        if (index != -1) {
            item.setId(id);
            items[index] = item;
        } else {
            result = false;
            System.out.println("Записи с данным id не найдено");
        }
        return result;
    }

    /**
     * Метод для удаления заявки.
     * public boolean delete(String id) находит заявку по id и удаляет ее. Потом перезаписывает массив таким образом,
     * чтобы пустая ячейка перезаписалась в конец массива.
     * Если id не найден метод возвращает false и сообщение об этом.
     * @return result
     */
    public boolean delete(String id) {
        boolean result = true;
        int index = indexOf(id);
        if (index != -1) {
            System.arraycopy(items, (index + 1), items, index, (position - index));
            items[position - 1] = null;
            position--;
        } else {
            result = false;
            System.out.println("Записи с данным id не найдено");
        }
        return result;
    }

    public Item[] getItems() {
        return items;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}

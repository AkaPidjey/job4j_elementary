package ru.job4j.array;

public class FindLoop {
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    /***
     * @param data - массив чисел
     * @param el- элемент, который нужно найти
     * @param start- индекс, с которого начинаем поиск
     * @param finish - индекс, которым заканчиваем поиск
     * @return rst - возвращает индекс найденного элемента, или значение -1, если элемент не найден
     ***/
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = start; index <= finish; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}

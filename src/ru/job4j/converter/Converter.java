package ru.job4j.converter;
/**
 * Класс для конвертации валюты.  Из рублей в доллары и евро.
 *
 * @author AkaPidjey
 */
public class Converter {
    /**
     * Метод перевода рублей в евро.
     * @param value - кол-во рублей.
     * @return rs1 - кол-во евро.
     */
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }
    /**
     * Метод перевода рублей в доллары.
     * @param value - кол-во рублей.
     * @return rs1 - кол-во долларов.
     */
    public static int rubleToDollar(int value) {
        int rsl = value / 60; // формула перевода рублей в доллоры.
        return rsl;
    }
    /**
     * Метод конвертации рубли в доллары и евро.
     * @param euro - кол-во евро.
     * @param dollar - кол-во долларов.
     */
    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int dollar = Converter.rubleToDollar(180);
        System.out.println("180 rubley are " + dollar + " dollar.");
    }
}

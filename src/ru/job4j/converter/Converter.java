package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; // формула перевода рублей в доллоры.
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int dollar = Converter.rubleToDollar(180);
        System.out.println("180 rubley are " + dollar + " dollar.");
        // Тестирование программы
        int in1 = 140; // тест входные данные
        int expected1 = 2;   //тест ожидаемое значение
        int out1 = rubleToEuro(in1); // тест результат работы проги
        boolean passed1 = expected1 == out1;
        System.out.println("Тест 1 - " + passed1);
        int in2 = 180; // тест входные данные
        int expected2 = 3;   //тест ожидаемое значение
        int out2 = rubleToDollar(in2); // тест результат работы проги
        boolean passed2 = expected2 == out2;
        System.out.println("Тест 2 - " + passed2);
    }
}

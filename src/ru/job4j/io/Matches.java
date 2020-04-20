package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        int count = 11;
        System.out.println("Ходит первый игрок. Возьми от 1 до 3 спичек");
        while (run) {
            int select = Integer.valueOf(input.nextLine());
            if (select > 0 && select < 4) {
                count = count - select;
                if (count <= 0) {
                    System.out.println("Игра завершена. Поздравляем");
                    run = false;
                } else if (count > 0) {
                    System.out.println("На столе осталось:" + count + " спичек");
                    System.out.println("Ходит следующий игрок. Возьми от 1 до 3 спичек");
                }
            } else {
                System.out.println("Нужно взять от 1 до 3 спичек. Игра звершена. Начните сначала");
                run = false;
            }
        }
    }
}

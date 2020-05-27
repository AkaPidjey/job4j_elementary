package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определять по полю приоритет.
     * Для вставки использовать add(int index, E value)
     * @param task задача
     */
    public void put(Task task) {
        int index = 0;

/*        for (int a = 0; a < tasks.size(); a++) {
            if (task.getPriority() < tasks.get(a).getPriority()) {
                index = a;
                break;
            }
          }
 */

        for (Task element : tasks) {
            if (task.getPriority() < element.getPriority()) {
                break;
            } else {
                index++;
            }
        }


        this.tasks.add(index, task);
    }

    public Task take() {
        return tasks.poll();
    }

    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.put(new Task("low", 5));
        pq.put(new Task("urgent", 1));
        pq.put(new Task("middle", 3));

        for (Object i : pq.tasks) {
            System.out.println(i);
        }
    }
}

package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.pojo.License;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenfindAll() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        Item item3 = new Item("test3");
        Item item4 = null;
        Item item5 = null;
        Item[] vvod = new Item[5];
        vvod[0] = item1;
        vvod[1] = item2;
        vvod[2] = item3;
        vvod[3] = item4;
        vvod[4] = item5;
        Item[] result = new Item[3];
        result[0] = item1;
        result[1] = item2;
        result[2] = item3;
        vvod = tracker.findAll();
        assertThat(result, is(vvod));
    }
}
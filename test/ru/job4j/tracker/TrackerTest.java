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
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        Item[] expect = {item1, item2, item3};
        assertThat(tracker.findAll(), is(expect));
    }

    @Test
    public void whenfindByName() {
        Tracker tracker = new Tracker();
        String value = "test2";
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        Item item3 = new Item("test3");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        Item[] expect = {item2};
        assertThat(tracker.findByName(value), is(expect));
    }

    @Test
    public void whenfindByID() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        Item item3 = new Item("test3");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        String value = item2.getId();
        Item expect = item2;
        assertThat(tracker.findById(value), is(expect));
    }

    @Test
    public void whenfindByIDNull() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        Item item3 = new Item("test3");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        String value = "nichego";
        Item expect = null;
        assertThat(tracker.findById(value), is(expect));
    }
}
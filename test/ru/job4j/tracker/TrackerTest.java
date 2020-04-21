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
        Item[] input = new Item[5];
        input[0] = new Item("test1");
        input[1] = new Item("test2");
        input[2] = new Item("test3");
        input[3] = null;
        input[4] = null;
        Item[] expect = new Item[3];
        expect[0] = input[0];
        expect[1] = input[1];
        expect[2] = input[2];
        Item[] result;
        result = tracker.findAll(input);
        assertArrayEquals(result, expect);
    }

    @Test
    public void whenfindByName() {
        Tracker tracker = new Tracker();
        String value = "test1";
        Item[] input = new Item[4];
        input[0] = new Item("test1");
        input[1] = new Item("test2");
        input[2] = new Item("test3");
        input[3] = new Item("test1");
        Item[] expect = new Item[2];
        expect[0] = input[0];
        expect[1] = input[3];
        Item[] result;
        result = tracker.findByName(value);
        assertArrayEquals(result, expect);
    }

    @Test
    public void whenfindByID() {
        Tracker tracker = new Tracker();
        Item value = new Item();
        value.setId("test4");
        Item in1 = new Item();
        in1.setId("test1");
        Item in2 = new Item();
        in2.setId("test2");
        Item in3 = new Item();
        in3.setId("test3");
        Item in4 = new Item();
        in4.setId("test4");
        Item[] input = new Item[4];
        input[0] = in1;
        input[1] = in2;
        input[2] = in3;
        input[3] = in4;
        Item expect = in4;
        Item result = tracker.findById(value.getId());
        assertEquals(result, expect);
    }


}
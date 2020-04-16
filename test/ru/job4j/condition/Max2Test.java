package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Max2Test {
    @Test
    public void whenMax1To2Then2() {
        int result = Max2.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax3ToMax3Then3() {
        int result = Max2.max(3, 3);
        assertThat(result, is(3));
    }
    @Test
    public void whenMax3ToMax3items() {
        int result = Max2.max(1, 2, 3);
        assertThat(result, is(3));
    }
    @Test
    public void whenMax2ToMax3items() {
        int result = Max2.max(2, 2, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax4ToMax4items() {
        int result = Max2.max(1, 2, 4, 3);
        assertThat(result, is(4));
    }
    @Test
    public void whenMax3ToMax4items() {
        int result = Max2.max(3, 3, 3, 3);
        assertThat(result, is(3));
    }

}
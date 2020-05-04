package ru.job4j.stragery;

import org.junit.Test;
import java.util.StringJoiner;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class TriagleTest {
    @Test
    public void whenDrawTriagle() {
        Triagle triagle = new Triagle();
        assertThat(triagle.draw(), is(new StringJoiner(System.lineSeparator())
                                        .add("   *   ")
                                        .add("  * *  ")
                                        .add(" *   * ")
                                        .add("*     *")
                                        .add("*******")
                                        .toString()
                                     )
        );
    }
}
package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaManagerTest {

    @Test
    public void findAllAndAddTest() {
        AfishaManager afisha = new AfishaManager();
        afisha.add("Movie 41");
        afisha.add("Movie 42");
        afisha.add("Movie 43");

        String[] expected = { "Movie 41", "Movie 42", "Movie 43" };
        String[] actual = afisha.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTest() {
        AfishaManager afisha = new AfishaManager(2);
        afisha.add("Movie 41");
        afisha.add("Movie 42");
        afisha.add("Movie 43");

        String[] expected = { "Movie 43", "Movie 42" };
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastBelowLimitTest() {
        AfishaManager afisha = new AfishaManager(5);
        afisha.add("Movie 41");
        afisha.add("Movie 42");
        afisha.add("Movie 43");

        String[] expected = { "Movie 43", "Movie 42", "Movie 41" };
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}

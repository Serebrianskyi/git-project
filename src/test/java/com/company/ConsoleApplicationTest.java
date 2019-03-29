package com.company;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ConsoleApplicationTest {

    @Test
    public void shouldReturnSum() {
        int actual = ConsoleApplication.sum(1, 2);
        int expected = 3;

        assertEquals(expected, actual);
    }

}
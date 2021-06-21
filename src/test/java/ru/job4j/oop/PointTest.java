package ru.job4j.oop;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance1() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2.0;
        double section = a.distance(b);
        assertEquals(expected, section, 0.1);
    }

    @Test
    public void distance2() {
        Point a = new Point(4, 4);
        Point b = new Point(10, 4);
        double expected = 6.0;
        double section = a.distance(b);
        assertEquals(expected, section, 0.1);
    }

    @Test
    public void distance3() {
        Point a = new Point(-100, -50);
        Point b = new Point(-100, -75);
        double expected = 25.0;
        double section = a.distance(b);
        assertEquals(expected, section, 0.1);
    }
}

package ru.netology.javaqa.stats.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class statsservicetest {
    @Test
    public void testsum() {
        statsservice service = new statsservice();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sum(sales);
        long expected = 180;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testavarage() {
        statsservice service = new statsservice();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.avarage(sales);
        long expected = 180 / 12;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testmaximum() {
        statsservice service = new statsservice();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.maximum(sales);
        long expected = 7;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testminimum() {
        statsservice service = new statsservice();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.minimum(sales);
        long expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void bellowMonths() {
        statsservice service = new statsservice();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.bellowMonths(sales);
        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void aboveMoths() {
        statsservice service = new statsservice();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.aboveMonths(sales);
        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }
}

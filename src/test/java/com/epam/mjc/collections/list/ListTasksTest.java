package com.epam.mjc.collections.list;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ListTasksTest {

    @Test
    public void testMethodTask1() {
        Task1 task1 = new Task1();

        String actualResult = task1.implement();

        String expectedResult = "Monday Tuesday Wednesday Thursday Friday Saturday Sunday";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMethodTask2() {
        Task2 task2 = new Task2();

        String actualResult = task2.implement();

        String expectedResult = "String1 String2 MJC String3 MJC";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMethodTask3() {
        Task3 task3 = new Task3();

        String actualResult = task3.implement();

        String expectedResult = "A B C D";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMethodTask4() {
        Task4 task4 = new Task4();

        String actualResult = task4.implement();

        String expectedResult = "Sunday Saturday Friday Thursday Wednesday Tuesday Monday";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMethodTask5() {
        Task5 task5 = new Task5();

        int actualResult = task5.implement();

        int expectedResult = -1;
        assertEquals(expectedResult, actualResult);
    }
}
package com.epam.mjc.collections.list;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ListSorterTest {

    @Test
    public void sortEmptyList() {
        ListSorter listSorter = new ListSorter();
        ArrayList<String> sourceArrayList = new ArrayList<>();
        ArrayList<String> expectedArrayList = new ArrayList<>();

        listSorter.sort(sourceArrayList);
        assertEquals(expectedArrayList, sourceArrayList);
    }

    @Test
    public void sortNonEmptyList() {
        ListSorter listSorter = new ListSorter();
        ArrayList<String> sourceArrayList = new ArrayList<>();
        sourceArrayList.add("7");
        sourceArrayList.add("10");
        sourceArrayList.add("6");
        sourceArrayList.add("-7");
        sourceArrayList.add("-2");
        sourceArrayList.add("0");
        sourceArrayList.add("-2");
        sourceArrayList.add("-23");

        ArrayList<String> expectedArrayList = new ArrayList<>();
        expectedArrayList.add("0");
        expectedArrayList.add("-2");
        expectedArrayList.add("-2");
        expectedArrayList.add("6");
        expectedArrayList.add("-7");
        expectedArrayList.add("7");
        expectedArrayList.add("10");
        expectedArrayList.add("-23");

        listSorter.sort(sourceArrayList);
        assertEquals(expectedArrayList, sourceArrayList);
    }
}

package com.epam.mjc.collections.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ListSorterTest {

    @Test
    public void sortEmptyList() {
        ListSorter listSorter = new ListSorter();
        List<String> sourceList = new ArrayList<>();
        List<String> expectedList = List.of();

        listSorter.sort(sourceList);
        assertEquals(expectedList, sourceList);
    }

    @Test
    public void sortNonEmptyList() {
        ListSorter listSorter = new ListSorter();
        List<String> sourceList = new ArrayList<>(List.of("7", "10", "6", "-7", "-2", "0", "-2", "-23"));
        List<String> expectedList = List.of("0", "-2", "-2", "6", "-7", "7", "10", "-23");

        listSorter.sort(sourceList);
        assertEquals(expectedList, sourceList);
    }
}

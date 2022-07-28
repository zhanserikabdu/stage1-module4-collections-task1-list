package com.epam.mjc.collections.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ArrayListCreatorTest {

    @Test
    public void createArrayListFromEmptyList() {
        ArrayListCreator arrayListCreator = new ArrayListCreator();
        ArrayList<String> expectedArrayList = new ArrayList<>();

        ArrayList<String> actualArrayList = arrayListCreator.createArrayList(new ArrayList<>());
        assertEquals(expectedArrayList, actualArrayList);
    }

    @Test
    public void createArrayListFromListWithTwoElements() {
        ArrayListCreator arrayListCreator = new ArrayListCreator();
        ArrayList<String> expectedArrayList = new ArrayList<>();

        ArrayList<String> actualArrayList = arrayListCreator.createArrayList(List.of("Hello", "Word"));
        assertEquals(expectedArrayList, actualArrayList);
    }

    @Test
    public void createArrayListFromListWithThreeElements() {
        ArrayListCreator arrayListCreator = new ArrayListCreator();
        ArrayList<String> expectedArrayList = new ArrayList<>(List.of("you", "you"));

        ArrayList<String> actualArrayList = arrayListCreator.createArrayList(List.of("I", "love", "you"));
        assertEquals(expectedArrayList, actualArrayList);
    }

    @Test
    public void createArrayListFromListWithFourElements() {
        ArrayListCreator arrayListCreator = new ArrayListCreator();
        ArrayList<String> expectedArrayList = new ArrayList<>(List.of("the", "the"));

        ArrayList<String> actualArrayList = arrayListCreator.createArrayList(List.of("Java", "is", "the", "best"));
        assertEquals(expectedArrayList, actualArrayList);
    }

    @Test
    public void createArrayListFromListWithSixElements() {
        ArrayListCreator arrayListCreator = new ArrayListCreator();
        ArrayList<String> expectedArrayList = new ArrayList<>(List.of("consist", "consist", "objects", "objects"));

        ArrayList<String> actualArrayList = arrayListCreator.createArrayList(List.of("List", "can", "consist",
                "of", "different", "objects"));
        assertEquals(expectedArrayList, actualArrayList);
    }
}

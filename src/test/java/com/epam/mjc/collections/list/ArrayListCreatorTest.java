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

        ArrayList<String> actualArrayList = arrayListCreator.createString(new ArrayList<>());
        assertEquals(expectedArrayList, actualArrayList);
    }

    @Test
    public void createArrayListFromListWithTwoElements() {
        ArrayListCreator arrayListCreator = new ArrayListCreator();
        ArrayList<String> expectedArrayList = new ArrayList<>();

        ArrayList<String> actualArrayList = arrayListCreator.createString(List.of("Hello", "Word"));
        assertEquals(expectedArrayList, actualArrayList);
    }

    @Test
    public void createArrayListFromListWithThreeElements() {
        ArrayListCreator arrayListCreator = new ArrayListCreator();
        ArrayList<String> expectedArrayList = new ArrayList<>();
        expectedArrayList.add("you");
        expectedArrayList.add("you");

        ArrayList<String> actualArrayList = arrayListCreator.createString(List.of("I", "love", "you"));
        assertEquals(expectedArrayList, actualArrayList);
    }

    @Test
    public void createArrayListFromListWithFourElements() {
        ArrayListCreator arrayListCreator = new ArrayListCreator();
        ArrayList<String> expectedArrayList = new ArrayList<>();
        expectedArrayList.add("the");
        expectedArrayList.add("the");

        ArrayList<String> actualArrayList = arrayListCreator.createString(List.of("Java", "is", "the", "best"));
        assertEquals(expectedArrayList, actualArrayList);
    }

    @Test
    public void createArrayListFromListWithSixElements() {
        ArrayListCreator arrayListCreator = new ArrayListCreator();
        ArrayList<String> expectedArrayList = new ArrayList<>();
        expectedArrayList.add("consist");
        expectedArrayList.add("consist");
        expectedArrayList.add("objects");
        expectedArrayList.add("objects");

        ArrayList<String> actualArrayList = arrayListCreator.createString(List.of("List", "can", "consist",
                "of", "different", "objects"));
        assertEquals(expectedArrayList, actualArrayList);
    }
}

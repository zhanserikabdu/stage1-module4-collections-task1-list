package com.epam.mjc.collections.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LinkedListCreatorTest {

    @Test
    public void createLinkedListFromEmptyList() {
        LinkedListCreator linkedListCreator = new LinkedListCreator();
        LinkedList<Integer> expectedLinkedList = new LinkedList<>();

        LinkedList<Integer> actualLinkedList = linkedListCreator.createLinkedList(new ArrayList<>());
        assertEquals(expectedLinkedList, actualLinkedList);
    }

    @Test
    public void createLinkedListFromListOfOddNumbers() {
        LinkedListCreator linkedListCreator = new LinkedListCreator();
        LinkedList<Integer> expectedLinkedList = new LinkedList<>();
        expectedLinkedList.add(7);
        expectedLinkedList.add(13);
        expectedLinkedList.add(25);
        expectedLinkedList.add(3);
        expectedLinkedList.add(47);


        LinkedList<Integer> actualLinkedList = linkedListCreator.createLinkedList(List.of(47, 3, 25, 13, 7));
        assertEquals(expectedLinkedList, actualLinkedList);
    }


    @Test
    public void createLinkedListFromListOfEvenNumbers() {
        LinkedListCreator linkedListCreator = new LinkedListCreator();
        LinkedList<Integer> expectedLinkedList = new LinkedList<>();
        expectedLinkedList.add(12);
        expectedLinkedList.add(44);
        expectedLinkedList.add(80);
        expectedLinkedList.add(2);
        expectedLinkedList.add(52);


        LinkedList<Integer> actualLinkedList = linkedListCreator.createLinkedList(List.of(12, 44, 80, 2, 52));
        assertEquals(expectedLinkedList, actualLinkedList);
    }

    @Test
    public void createLinkedListFromListOfOddAndEvenNumbers() {
        LinkedListCreator linkedListCreator = new LinkedListCreator();
        LinkedList<Integer> expectedLinkedList = new LinkedList<>();
        expectedLinkedList.add(7);
        expectedLinkedList.add(13);
        expectedLinkedList.add(25);
        expectedLinkedList.add(3);
        expectedLinkedList.add(47);
        expectedLinkedList.add(12);
        expectedLinkedList.add(44);
        expectedLinkedList.add(80);
        expectedLinkedList.add(2);
        expectedLinkedList.add(52);


        LinkedList<Integer> actualLinkedList = linkedListCreator.createLinkedList(List.of(47, 3, 12, 25, 44, 80, 13, 2, 7, 52));
        assertEquals(expectedLinkedList, actualLinkedList);
    }

}

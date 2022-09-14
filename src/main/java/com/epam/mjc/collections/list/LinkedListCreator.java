package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        List<Integer> part2 = new LinkedList<>();
        int size = sourceList.size();
        for (int i = 0; i < size; i++) {
            if (sourceList.get(i) % 2 != 0) {
                if (part2.size() >= 1)
                    part2.add(0, sourceList.get(i));
                else
                    part2.add(sourceList.get(i));
            } else {
                part2.add(sourceList.get(i));
            }
        }
        return (LinkedList<Integer>) part2;
    }
}

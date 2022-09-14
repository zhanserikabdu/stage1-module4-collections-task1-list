package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        int length = sourceList.size();
       ArrayList<String> part = new ArrayList<>();
        for(int i = 1; i<=length; i++){
       if(i % 3 == 0){
            part.add(sourceList.get(i-1));
           part.add(sourceList.get(i-1));
             }
           }
        return part;
       }
    }


package com.sda.designpatterns.behavioral.iterator.example;

import java.util.*;

public class IteratorMain {


    public static void main(String[] args) {
        List<Integer> integetList = Arrays.asList(1, 23, 4, 5, 6);

        Iterator<Integer> iterator = integetList.iterator();

        Map<Integer, String> integerStringHashMap = new HashMap<>();

        integerStringHashMap.put(1, "Jędruś");
        integerStringHashMap.put(2, "Ania");
        integerStringHashMap.put(3, "Ania");

        int a = 10;

        Integer boxed = new Integer(a);

        int  b = boxed;

        Iterator<String> studentsIterator
                = integerStringHashMap.values().iterator();


        while (studentsIterator.hasNext()){
            String next = studentsIterator.next();
            System.out.println(next);
        }

    }
}

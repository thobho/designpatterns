package com.sda.designpatterns.behavioral.exercises.iteratordemo;

import java.util.*;

public class IteratorDemo {

    public static void main(String[] args) {
        List<String> testList = Arrays.asList("test", "kot", "dom");
        Set<String> testSet = new HashSet<>();
        testSet.add("test");
        testSet.add("fdagg");
        testSet.add("test");

        printAllCollectionsElements(testSet);
    }

    private static void printAllCollectionsElements(Collection<String> collection){
        Iterator<String> iterator = collection.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}

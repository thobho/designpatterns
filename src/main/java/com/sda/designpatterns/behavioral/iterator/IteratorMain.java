package com.sda.designpatterns.behavioral.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorMain {


    public static void main(String[] args) {
        List<Integer> integetList = Arrays.asList(1, 23, 4, 5, 6);

        Iterator<Integer> iterator = integetList.iterator();


        while (iterator.hasNext()){
            Integer next = iterator.next();


            System.out.println(next);
        }

    }
}

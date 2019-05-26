package com.sda.designpatterns.structural.adapter.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintableTest {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("test", "sda", "wzorce");

        new PrintListAdapter(list).print();
    }
}

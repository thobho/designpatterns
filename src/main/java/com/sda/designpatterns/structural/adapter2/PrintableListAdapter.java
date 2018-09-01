package com.sda.designpatterns.structural.adapter2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PrintableListAdapter implements PrintableList {

    private List<String> stringList;

    public PrintableListAdapter(List<String> stringList) {
        this.stringList = stringList;
    }

    @Override
    public void print() {
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }
    }

    public static void main(String[] args) {
        List<String> integers = Arrays.asList("dasd", "dasd", "dasd");
        PrintableList printableListAdapter = new PrintableListAdapter(integers);
        printableListAdapter.print();
    }
}

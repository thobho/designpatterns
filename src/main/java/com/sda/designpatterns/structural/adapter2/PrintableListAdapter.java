package com.sda.designpatterns.structural.adapter2;

import java.util.Arrays;
import java.util.List;

public class PrintableListAdapter implements Printable {

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
        List<String> strings = Arrays.asList("dasd", "dasdvsd", "daxzvzsd");
        Printable printableAdapter = new PrintableListAdapter(strings);
        printableAdapter.print();
    }
}

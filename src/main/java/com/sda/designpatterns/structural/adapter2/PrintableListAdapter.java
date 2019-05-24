package com.sda.designpatterns.structural.adapter2;

import java.util.Arrays;
import java.util.HashMap;
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

        HashMap<String, String> obiady = new HashMap<>();
        obiady.put("Mirek", "Naleśniki");
        obiady.put("Andrzej", "Schabowy");

        PrintableMapAdapter printableMapAdapter = new PrintableMapAdapter(obiady);
        printableMapAdapter.print();

        Printable printableAdapter = new PrintableListAdapter(strings);
        printableAdapter.print();

        List<Printable> printables = Arrays.asList(printableAdapter, printableAdapter);
    }
}

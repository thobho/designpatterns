package com.sda.designpatterns.structural.adapter.exercises;

import java.util.List;

public class PrintListAdapter implements Printable{

    private List<String> adaptee;

    public PrintListAdapter(List<String> adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void print() {

        for (String s: this.adaptee) {
            System.out.println(s);
        }
    }
}

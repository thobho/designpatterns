package com.sda.designpatterns.behavioral.linkedlist;

public class LilnkedListMain {

    public static void main(String[] args) {

        Node lastNode = new Node(3, null);
        Node middleNode = new Node(30, lastNode);
        Node firstNode = new Node(100, middleNode);


        printAll(firstNode);

    }

    private static void printAll(Node head){

        Node actualPrintingNode = head;

        while (actualPrintingNode != null){
            System.out.println(actualPrintingNode.getData());
            actualPrintingNode = actualPrintingNode.getNextNode();
        }

    }
}

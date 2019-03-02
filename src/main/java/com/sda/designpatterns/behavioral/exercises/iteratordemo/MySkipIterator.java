package com.sda.designpatterns.behavioral.exercises.iteratordemo;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MySkipIterator<T> implements MyIterator<T> {

    private Collection<T> collection;
    private ListIterator<T> collectionIterator;


    public MySkipIterator(List<T> collection) {
        collection.size();
        this.collection = collection;
        collectionIterator = collection.listIterator();
    }

    @Override
    public boolean hasNext() {
        if(collectionIterator.hasNext()){
            collectionIterator.next();
        }
        boolean b = collectionIterator.hasNext();
        collectionIterator.previous();
        return b;
    }

    @Override
    public T next() {
        collectionIterator.next();
        return collectionIterator.next();
    }
}

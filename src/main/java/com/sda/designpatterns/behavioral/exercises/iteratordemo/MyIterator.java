package com.sda.designpatterns.behavioral.exercises.iteratordemo;

public interface MyIterator<T> {
    boolean hasNext();

    T next();
}

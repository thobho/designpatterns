package com.sda.designpatterns.creational.factorymethod.exercises;

import java.util.Random;

public class ShapeFactory {


    public static Shape createShape(int shapeId){
        switch (shapeId){
            case 1:
                return new Circle();
            case 2:
                return new Square();
            default:
                throw new IllegalStateException();
        }
    }

    public static Shape randomShape(){
        int generatedRandomId = new Random().nextInt(2) + 1;
        return ShapeFactory.createShape(generatedRandomId);
    }

}

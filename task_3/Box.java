package ru.gb.java_3.hw_1.task_3;

import java.util.ArrayList;

public class Box <T extends Fruit> {

    public <T> T putBox(T fruit){
        ArrayList <T> box = new ArrayList<>();
        box.add(fruit);
        return (T) box;
    }
}

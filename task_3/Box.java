package ru.gb.java_3.hw_1.task_3;

import java.util.ArrayList;

public class Box <T extends Fruit> extends ArrayList {
    ArrayList <T> box = new ArrayList<>();
    public void putBox(T fruit){
      box.add(fruit);
        System.out.println(box);
    }
}

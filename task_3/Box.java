package ru.gb.java_3.hw_1.task_3;

import java.util.ArrayList;

public class Box <T extends Fruit> {
    ArrayList<T> box = new ArrayList<>();

    public void putBox(T fruit, int count) {
        for (int i = 0; i < count; i++) {
            box.add(fruit);
        }
    }

    public Float getWeight() {
        Float weight = 0.0f;
        for (Fruit i : box) {
            weight += i.getWeight();
        }
        return weight;
    }

    public boolean compare(Box box) {
        return this.getWeight().equals(box.getWeight());
    }

    public void shiftFruit(Box<T> box, int count) {
        int f = 0;
        if (this.box.size() < count) {
            System.out.println("В корзине нет столько фруктов");
        } else {
            for (T i : this.box) {
                box.box.add(i);
                f++;
                if (f == count) {
                    break;
                }
            }
            if(count == this.box.size()){
                this.box.clear();
            } else {
                for (int i = 0; i < count; i++) {
                    this.box.remove(i);
                }
            }
        }
    }
}

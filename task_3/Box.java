package ru.gb.java_3.hw_1.task_3;

import java.util.ArrayList;

public class Box <T extends Fruit>{
    ArrayList <T> box = new ArrayList<>();
    public void putBox(T fruit){
      box.add(fruit);
        System.out.println(box);
    }
    public Float getWeight(){
        Float weight = 0.0f;
        for (Fruit i : box) {
            weight+=i.getWeight();
        }
        return weight;
    }
    public boolean compare(Box box){
       return this.getWeight().equals(box.getWeight());
    }

    public void shiftFruit(Box box, int count){

        for (int i = 0; i < count; i++) {
            if (this.box.get(i).getClass().equals(box.box.get(i).getClass())) {
                box.box.add(this.box.get(i));
                this.box.remove(i);

            } else System.out.println("Коробки с разными фруктами");
        }
    }
}

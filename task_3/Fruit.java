package ru.gb.java_3.hw_1.task_3;

public class Fruit {
    private String name;
    private Float weight;

    public Fruit(String name, Float weight){
        this.name = name;
        this.weight = weight;

    }
    public Float getWeight(){
        return this.weight;
    }
    public String getName(){
        return this.name;
    }
}

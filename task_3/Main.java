package ru.gb.java_3.hw_1.task_3;

import com.sun.org.apache.xpath.internal.operations.Or;

/*
a. Есть классы Fruit -> Apple, Orange;(больше фруктов не надо)
b. Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
c. Для хранения фруктов внутри коробки можете использовать ArrayList;
d. Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и вес одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той, которую подадут в compare в качестве параметра, true - если их веса равны, false в противном случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);
f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку(помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами), соответственно в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в этой коробке;
g. Не забываем про метод добавления фрукта в коробку.
*/
public class Main {

    public static void main(String[] args) {
        Orange o = new Orange("Апельсинка", 1.5f);
        Apple a = new Apple("Яблочко", 1.0f);
        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        appleBox.putBox(a, 5);
        orangeBox.putBox(o,7);
        System.out.println( appleBox.getWeight());
        System.out.println( orangeBox.getWeight());
        System.out.println(appleBox.compare(orangeBox));
        appleBox.shiftFruit(appleBox2,5);
       //orangeBox.shiftFruit(appleBox2,2); // не получится
        System.out.println( appleBox.getWeight());
        System.out.println( appleBox2.getWeight());
        appleBox2.shiftFruit(appleBox,1);
        System.out.println( appleBox.getWeight());
        System.out.println( appleBox2.getWeight());




    }
}

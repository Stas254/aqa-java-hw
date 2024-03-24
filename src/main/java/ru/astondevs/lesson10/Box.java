package ru.astondevs.lesson10;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits = new ArrayList<>();
    private float weight = 2.0f;   //пусть будет изначальный вес пустой коробки


    public float getWeight() {
        return weight;
    }

    public void addFruitBox(T fruit) {
        fruits.add(fruit);
        weight += fruit.getWeightFruit();
        /*if (fruit instanceof Apple)
            weight += 1.0f;
        else if (fruit instanceof Orange)
            weight += 1.5f;*/
    }

    public boolean compare(Box<?> box) {
        //return Math.abs(getWeight() - box.getWeight()) < 0.0001;   //учтем погрешность при взвешивании
        return Float.compare(getWeight(), box.getWeight()) == 0;
    }

    public void transfer(Box<T> box) {
        for (T fruit : fruits) {
            box.addFruitBox(fruit);
        }
        fruits.clear();
        weight = 2.0f;   //предполагаемый вес пустой коробки
    }

}
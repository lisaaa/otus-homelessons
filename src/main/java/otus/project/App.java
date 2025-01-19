package otus.project;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        List<Apple> apples = new ArrayList<>();
        apples.add(0,apple1);
        apples.add(1,apple2);
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        List<Orange> oranges = new ArrayList<>();
        oranges.add(0,orange1);
        oranges.add(1,orange2);
        Box<Apple> b1 = new Box<>();
        Box<Orange> b2 = new Box<>();
        b1.addFruit(apples);
        b2.addFruit(oranges);

        b1.accountWeightBox();
        b2.accountWeightBox();
        b1.interlandFruit(b2);
        //System.out.println("сравним коробки " + b1.compareTo(b2));
        //System.out.println("сравним коробки " + b1.compare(b2));

        System.out.println(b1.toString());

    }
}

package otus.project;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit> implements  Comparable<Box> {
    private List<T> fruits = new ArrayList<>();
    private int weight;

    public void addFruit(List<? extends Fruit> f){
        weight = 0;
        for (int i = 0; i < f.size(); i++) {
            fruits.add(i, (T) f.get(i));
            weight += f.get(i).getWeight();
        }
    }

    public int accountWeightBox(){
         weight = 0;
        for (int i = 0; i < this.fruits.size(); i++) {
            weight += fruits.get(i).getWeight();
        }
        System.out.println(weight);
        return weight;
    }

    public void interlandFruit(Box b){
        this.fruits.addAll(b.fruits);
        weight = accountWeightBox();
    }

    public boolean compare(Box box){
       if (compareTo(box) == 0){
           return true;
       } else return false;
    }

    @Override
    public int compareTo(Box box) {
        return this.weight - box.weight;
    }

    @Override
    public String toString() {

        return "Box{" +
                "fruits=" + fruits.size() +
                ", weigh=" + weight +
                '}';
    }
}

package otus.project;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit> implements  Comparable<Box> {
    private List<T> fruits = new ArrayList<>();
    private int weight = 0;

    public void addFruit(List<? extends Fruit> f){
        for (int i = 0; i < f.size(); i++) {
            fruits.add(i, (T) f.get(i));
        }
        this.weight = accountWeightBox();
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int accountWeightBox(){
         this.weight = 0;
        for (int i = 0; i < this.fruits.size(); i++) {
            this.weight += fruits.get(i).getWeight();
        }
        return this.weight;
    }

    public void interlandFruit(Box b){
        this.fruits.addAll(b.fruits);
        this.weight = accountWeightBox();
        b.fruits.removeAll(b.fruits);
        b.setWeight(0);
    }

    public boolean compare(Box box){
       if (compareTo(box) == 0){
           return true;
       } else return false;
    }

    @Override
    public int compareTo(Box box) {
        return accountWeightBox() - box.accountWeightBox();
    }

    @Override
    public String toString() {

        return "Box{" +
                "fruits=" + fruits.size() +
                ", weigh=" + weight +
                '}';
    }
}

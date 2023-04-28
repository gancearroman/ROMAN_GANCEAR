package org.example.homework_nr_8;

public class Elephant extends Erbivor implements Animal {

    Integer numberOfPairsOfLegs;
    String color;

    public Elephant(Integer numberOfPairsOfLegs, String color) {
        this.numberOfPairsOfLegs = numberOfPairsOfLegs;
        this.color = color;
    }


    @Override
    public void numberOfLegs() {
        System.out.println("Elephant has " + PairOfLegs * this.numberOfPairsOfLegs + " legs");
    }

    @Override
    public void WhoIsThis() {
        Animal.super.WhoIsThis();
    }

    @Override
    public void color() {
        System.out.println("Elephant color is " + this.color);

    }


    @Override
    public void CanFly() {
        System.out.println("Elephant can't fly");

    }

    @Override
    void voice() {
        System.out.println("Elephant makes uuuuuuuuuu");

    }
}

package org.example.homework_nr_7.part2;

public class Circle extends TwoDimensionalShape {

    public Integer radius;

    public Circle(Integer radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        System.out.println("Circle area is - " + 3.14*(radius*radius));

    }
}

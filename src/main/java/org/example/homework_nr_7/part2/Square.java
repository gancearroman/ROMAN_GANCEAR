package org.example.homework_nr_7.part2;

public class Square extends TwoDimensionalShape {

    public Integer side;

    public Square(Integer side) {
        this.side = side;
    }

    @Override
    public void area() {
        System.out.println("Square area is - " + side*side);

    }
}

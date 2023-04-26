package org.example.homework_nr_7.part2;

public class Cube extends ThreeDimensionalShape {
    public Integer side;

    public Cube(Integer side) {
        this.side = side;
    }

    @Override
    public void volume() {
        System.out.println("Cube volume is - " + side*side*side);

    }

    @Override
    public void area() {
        System.out.println("Cube area is - " + side*side*6);

    }
}

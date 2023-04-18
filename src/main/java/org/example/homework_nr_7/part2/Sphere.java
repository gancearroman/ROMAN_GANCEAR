package org.example.homework_nr_7.part2;

public class Sphere extends ThreeDimensionalShape {
    public Integer radius;

    public Sphere(Integer radius) {
        this.radius = radius;
    }

    @Override
    public void volume() {
        System.out.println("Sphere volume is - " + 4/3*3.14*(radius*radius*radius));

    }

    @Override
    public void area() {
        System.out.println("Sphere area is - " + 4*3.14*(radius*radius));

    }
}

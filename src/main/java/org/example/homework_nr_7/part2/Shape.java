package org.example.homework_nr_7.part2;

public class Shape {

    public static void main(String[] args) {

        Cube newCube = new Cube(4);
        Sphere newSphere = new Sphere(3);
        Square newSquare = new Square(1);
        Circle newCircle = new Circle(12);


        newCube.volume();
        newCube.area();
        newSphere.volume();
        newSphere.area();
        newCircle.area();
        newSquare.area();
    }
}

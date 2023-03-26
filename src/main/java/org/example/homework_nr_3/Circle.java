package org.example.homework_nr_3;

public class Circle {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    } // Конструктор


    public static double calculateArea(double radius){
        return 3.14*(radius*radius);
    } //Метод вычисления площади calculateArea


    public static void main(String[] args){
        System.out.println(calculateArea(7));

        Circle NewCircle = new Circle(12); //Создаём новый обьек NewCircle

        System.out.println("Площадь окружности равна " + calculateArea(NewCircle.radius));

    }

}

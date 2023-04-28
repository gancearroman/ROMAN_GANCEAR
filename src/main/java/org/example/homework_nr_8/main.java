package org.example.homework_nr_8;

public class main {

    public static void main(String[] args) {
        //Создаём обьект через интерфейс Animal
        Animal FirstElephant = new Elephant(2, "gray");

        //Создаём обьект через класс Elephant
        Elephant SecondElephant = new Elephant(2, "black");

        Erbivor ThirdElephant = new Elephant(2, "gray");

        //Расчёт количества ног путём произведения количества пар ног на статическую переменную в интерфейсе
        FirstElephant.numberOfLegs();
        FirstElephant.WhoIsThis();
        FirstElephant.CanFly();
        FirstElephant.color();
        SecondElephant.color();

        //Метод eats() не работает с FirstElephant т.к интрефейс Animal не наследует класс Erbivor
        SecondElephant.eats();
        //Метод voice() не работает с FirstElephant т.к интрефейс Animal не наследует класс Erbivor
        SecondElephant.voice();
        //Используем методы класса Erbivor с обьектами типа Elephant созданными через Erbivor
        ThirdElephant.eats();
        ThirdElephant.voice();


    }
}

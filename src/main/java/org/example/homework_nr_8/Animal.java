package org.example.homework_nr_8;

public interface Animal {

    Integer PAIR_OF_LEGS = 2; //Статическая переменная. Количество ног в одной паре.

        void numberOfLegs();


    default void WhoIsThis() {
        System.out.println("Is animal");
    }

    void color();


    void CanFly();

    static void Habitat() {
        System.out.println("lives in the savannah");
    }


}

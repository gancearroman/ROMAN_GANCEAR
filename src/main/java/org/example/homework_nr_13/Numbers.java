package org.example.homework_nr_13;

public class Numbers {
    public Numbers(int number) {
        this.number = number;
    }
    static int number;
    public void DivisionBy(int x) {
        if(x == 0)
            throw new IllegalArgumentException("argument is 0");
        System.out.println(number/x);
    }

    public static void main(String[] args) {
        Numbers newNumber = new Numbers(4);
        newNumber.DivisionBy(2);
        newNumber.DivisionBy(0);


    }



}

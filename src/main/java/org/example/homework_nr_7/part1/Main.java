package org.example.homework_nr_7.part1;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Roman", "Florilor 1");
        Student student = new Student("Maxim", "Puskin 14", "History", 2023, 750.00);
        Staff staff = new Staff("Alex", "Moscova 7", "nr.55", 7800.00 );

        System.out.println(student);
        System.out.println(staff);


    }
}

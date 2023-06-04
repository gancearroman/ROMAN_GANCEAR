package org.example.homework_nr_13;

import javax.naming.InvalidNameException;

public class Person {

    public static void main(String[] args) throws InvalidNameException {
        Person pr1 = new Person("Erica", "", 12);
        Person pr2 = new Person("John", "Walker", 150);


    }

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String firstName, String lastName, int age) throws InvalidNameException {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        if(age > 150 | age <0)
            throw new InvalidNameException("InvalidAgeException");
        if(firstName == null || firstName.isEmpty())
            throw new InvalidNameException("Name is null or is empty");
        if(lastName == null || lastName.isEmpty())
            throw new InvalidNameException("Last name is null or is empty");

    }
}

package org.example.homework_nr_12;

public class Employee {
    private String name;
    private String surname;
    private Integer age;
    boolean isPayedByHour;
    boolean canConductInterview;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isPayedByHour() {
        return isPayedByHour;
    }

    public void setPayedByHour(boolean payedByHour) {
        isPayedByHour = payedByHour;
    }

    public boolean isCanConductInterview() {
        return canConductInterview;
    }

    public void setCanConductInterview(boolean canConductInterview) {
        this.canConductInterview = canConductInterview;
    }

    public Employee(String name, String surname, Integer age, boolean isPayedByHour, boolean canConductInterview) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.isPayedByHour = isPayedByHour;
        this.canConductInterview = canConductInterview;
    }
}

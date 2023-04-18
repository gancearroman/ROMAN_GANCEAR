package org.example.homework_nr_6;

public class Employee {

            private String name;
            private int age;
            private String department;

            public Employee(String name, int age, String department) {
                this.name = name;
                this.age = age;
                this.department = department;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public String getDepartment() {
                return department;
            }

            public void setDepartment(String department) {
                this.department = department;
            }


    public static void main(String[] args) {

        Employee person1 = new Employee("Irina", 37, "Finance");
        Employee person2 = new Employee("Alex", 42, "Transport");
        Employee person3 = new Employee("Sophia", 22, "Marketing");

    }
    }




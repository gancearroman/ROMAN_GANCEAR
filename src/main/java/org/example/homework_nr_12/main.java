package org.example.homework_nr_12;

import java.util.*;
import java.util.stream.Collectors;

public class main {

    public static void main(String[] args) {


        Employee person1 = new Employee("Irina", "Revenco", 25, false, true);
        Employee person2 = new Employee("Oxana", "Josan", 35, true, true);
        Employee person3 = new Employee("Alex", "Gradinar", 22, true, false);
        Employee person4 = new Employee("Boris", "Necrutu", 34, true, false);
        Employee person5 = new Employee("Inga", "Maxian", 42, false, true);
        Employee person6 = new Employee("Elvira", "Stefanet", 22, true, false);
        Employee person7 = new Employee("Ion", "Corobceanu", 33, false, true);
        Employee person8 = new Employee("Eric", "Gutu", 31, true, false);
        Employee person9 = new Employee("Andrei", "Mahu", 30, true, false);
        Employee person10 = new Employee("Serghei", "Lazu", 29, false, true);

        List<Employee> employeeArray = new ArrayList<>(
                Arrays.asList(
                        person1, person2, person3, person4, person5, person6, person7, person8, person9, person10
                )
        );

        System.out.println("___________________задание номер 5___________________");

        employeeArray.stream()
                .filter(e -> e.getAge() > 25)
                .filter(e -> e.canConductInterview)
                .filter(e -> e.isPayedByHour)
                .distinct()
                .forEach(e -> System.out.println(e.getName()));

        System.out.println("___________________задание номер 6___________________");

        employeeArray.stream()
                .filter(e -> e.getAge() > 30)
                .filter(e -> !e.isPayedByHour)
                .sorted(Comparator.comparing(Employee::getName))
                .forEach(e -> System.out.println(e.getName()));

        System.out.println("___________________задание номер 7___________________");

        Optional<Employee> newEmployee = employeeArray.stream()
                .filter(e -> e.isPayedByHour)
                .filter(e -> e.canConductInterview)
                .findFirst();

        if(newEmployee.isPresent())
            System.out.println(newEmployee.get().getName());
        else
            System.out.println("Employee was not found!");


        System.out.println("___________________задание номер 8___________________");

        employeeArray.stream()
                .map(e -> e.getSurname())
                .sorted()
                .forEach(e -> System.out.println(e.toString()));
    }


}


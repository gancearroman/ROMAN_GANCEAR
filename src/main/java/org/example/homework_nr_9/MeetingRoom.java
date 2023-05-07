package org.example.homework_nr_9;


import java.util.ArrayList;
import java.util.List;

public class MeetingRoom {

    public List<Employee> list = new ArrayList<>();

    public void MeetingRoom(Employee array[]) {
        for (Employee x : array
        ) {
            if (x instanceof AttenTraining) {
                list.add(x);
            }
        }
        System.out.println(list.toString());
    }

    }


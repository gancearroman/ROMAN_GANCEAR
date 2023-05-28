package org.example.homework_nr_9;

import java.util.ArrayList;
import java.util.List;

public class main {


    public static void main(String[] args) {


        Manager manager1 = new Manager("Alex", "Balan", "Retail", 2000);
        Manager manager2 = new Manager("Olga", "Ceban", "Retail", 1650);
        Programmer programmer1 = new Programmer("Igor", "Cretu", "Development", 2300);


        Employee[] arrayEmployee = new Employee[]{
                manager1,
                manager2,
                programmer1
        };

        //Первая часть задания
        MeetingRoom test = new MeetingRoom();
        test.MeetingRoom(arrayEmployee);

        //Вторая часть задания. Проверяем и в случае если работник не может проводить интервью кастим и даём ему возможность тоже проводить интервью
//
        for (Employee worker : arrayEmployee
        ) {
            if (worker instanceof Interviewble) {
                ((Interviewble) worker).CanProvideInterview();
            } else {
                ((AttenTraining) worker).CanProvideTrainig();

            }


        }


    }
}

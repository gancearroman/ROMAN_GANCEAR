package org.example.homework_nr_9;

public class Manager extends Employee implements AttenTraining, Interviewble {

    public Manager(String name, String surname, String department, Integer salary) {
        super(name, surname, department, salary);
    }


    @Override
    public void CanProvideTrainig() {
        System.out.println(this.getName() + " can provide training");

    }

    @Override
    public void CanProvideInterview() {
        System.out.println(this.getName() + " can provide interview");

    }
}

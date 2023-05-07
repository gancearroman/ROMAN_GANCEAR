package org.example.homework_nr_9;

public class Programmer extends Employee  implements AttenTraining  {
    Integer age;

    public Programmer(String name, String surname, String department, Integer salary) {
        super(name, surname, department, salary);
    }


    @Override
    public void CanProvideTrainig() {
        System.out.println(this.getName() + " can provide training");

    }
}






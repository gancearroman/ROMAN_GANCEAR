package org.example.homework_nr_9;

public interface AttenTraining {
    default void CanProvideTrainig(){
        System.out.println(this + " can provide trainig");
    };
}

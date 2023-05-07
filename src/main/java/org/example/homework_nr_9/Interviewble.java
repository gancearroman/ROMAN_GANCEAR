package org.example.homework_nr_9;

public interface Interviewble {
    default void CanProvideInterview(){
        System.out.println(this + " can provide interview");
    };
}

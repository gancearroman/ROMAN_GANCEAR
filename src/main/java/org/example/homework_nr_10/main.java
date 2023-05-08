package org.example.homework_nr_10;

import java.util.*;
import java.util.Queue;

public class main {

    public static void main(String[] args) {


        //Пункт первый. List To DO

        List<String> ListToDo = new ArrayList<>();

        ListToDo.add("Send mail");
        ListToDo.add("Atten trainig");
        ListToDo.add("Call sister");
        ListToDo.add("Repair car");


        //Создаём список для второго задания

        List<String> Values = new ArrayList<>();

        Values.add("012");
        Values.add("077");
        Values.add("132");
        Values.add("088");
        Values.add("012"); //Повтор
        Values.add("032"); //Повтор
        Values.add("014");
        Values.add("012"); //Повтор

        //Создаём HashMap колекцию для словаря

        HashMap<String, String> vocabular = new HashMap<String, String>();
        vocabular.put("House", "Casa");
        vocabular.put("Lake", "Lac");
        vocabular.put("Tree", "Copac");
        vocabular.put("Cat", "Pisica");
        vocabular.put("City", "Oras");
        vocabular.put("Place", "Loc");
        vocabular.put("Furniture", "Mobila");
        vocabular.put("Sky", "Cer");
        vocabular.put("Winter", "Iarna");
        vocabular.put("September", "Septembrie");

        //LIFO. Используем колекцию Queue

        Queue<String> queueToTheDoctor = new LinkedList<String>();
        queueToTheDoctor.add("Alex");
        queueToTheDoctor.add("Olga");
        queueToTheDoctor.add("Ben");
        queueToTheDoctor.add("Kristian");
        queueToTheDoctor.add("Max");

        System.out.println(queueToTheDoctor);
        System.out.println(queueToTheDoctor.peek() + " was deleted");
        queueToTheDoctor.poll();
        System.out.println(queueToTheDoctor.peek() + " was deleted");
        queueToTheDoctor.poll();
        System.out.println(queueToTheDoctor.peek() + " was deleted");
        queueToTheDoctor.poll();
        System.out.println(queueToTheDoctor.peek() + " next in the queue");


        //Вызываем метод. Первое задание
        printAllElements(ListToDo);
        System.out.println("-------------------------------------------------------------------");
        //Вызываем метод. Второе задание
        returnUniqueValuesFromList(Values);
        System.out.println("-------------------------------------------------------------------");
        //Вывод на экран словаря
        printVocabulary(vocabular);
        System.out.println("-------------------------------------------------------------------");
        ListToDo.removeIf(e -> e.startsWith("A"));
        System.out.println(ListToDo); //Вывод списка без пункта первая буква которого "A"
        System.out.println("-------------------------------------------------------------------");
        ListToDo.replaceAll(e -> e.replaceAll("al", "replaced String"));
        System.out.println(ListToDo); //Не смог найти решение, чтобы заменить слово целиком((
    }

    //Метод для пункта первого. Подходит для работы с любым листом.

    static void printAllElements(List<String> inputList) {
        for (String element : inputList
        ) {
            System.out.println(element);
        }
    }

    //Метод для второго пункта. Оставляет в списке только уникальные значения
    static void returnUniqueValuesFromList(List<String> inputList) {
        HashSet<String> set = new HashSet<>(inputList);
        List<String> uniqueValuesList = new ArrayList<>(set);
        System.out.println(uniqueValuesList);
    }

    //Метод для вывода словаря с переходом на новую строку
    static void printVocabulary(HashMap<String, String> inputHashMap) {
        for (Map.Entry<String, String> element : inputHashMap.entrySet()
        ) {
            System.out.println(element.getKey() + "-" + element.getValue());

        }
    }


}






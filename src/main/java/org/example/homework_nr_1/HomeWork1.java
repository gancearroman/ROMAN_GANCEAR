package org.example.homework_nr_1;

public class HomeWork1 {

    public static void main(String[] args){
        System.out.println("Hello World!");

        /* В названия переменных я поставил символ "_" т.к. с пробелом появлялась ошибка
           Скорее всего необходимо было заключать назвния переменных в "", чтобы точно соблюдать условия ТЗ.
           Незнаю прав я или нет
             */

        long Current_World_Population = 7811080815L;
        int Cars_Produced_This_Year = 55235358;
        char First_Letter_In_Alphabet = 'A';
        boolean Java_Is_Amazing = true;
        float Pi = 3.14159F;

        /* Я не очень понял, что именно выводить на экран. Значение переменной или название. Я вывел значение.
        Можно было вывести и название и значение:
                System.out.println("Current World Population " + Current_World_Population);
             */

        System.out.println(Current_World_Population);
        System.out.println(Cars_Produced_This_Year);
        System.out.println(First_Letter_In_Alphabet);
        System.out.println(Java_Is_Amazing);
        System.out.println(Pi);

        /* Я не очень понимаю правильно ли я обьявляю переменные в середине программы.
           Возможно их все нужно обьявлять вначале? С другой стороны в таком методе обьявления тоже есть логика
              */
        double Price = 7.56;
        double Tax = 9.2;
        int Quantity = 1857568452;
        double Sum = 0;

        System.out.println(Price);
        System.out.println(Tax);
        System.out.println(Quantity);
        System.out.println(Sum);

        double total = Price + Tax * Quantity + Sum;

        System.out.println(total);


         }
    }



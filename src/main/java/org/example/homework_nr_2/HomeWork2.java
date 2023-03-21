package org.example.homework_nr_2;

public class HomeWork2 {

    public static void main(String[] args) {

        /* Внутри метода main напишите switch-case который будет принимать в качестве переменной int от 0 до 12 и в
           зависимости от числа отобразить на экран месяц в году, например число 3 -> Март
         */
        System.out.println("Задание номер 4"); // Просто для разграничения информации выводимой в консоль
    byte month_number = 3;

        switch (month_number) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Некорректное значение");
        }

         /* Внутри метода main напишите цикл который отображает в консоль все числа от 100 до 1000
         которые делятся на 5
          */

        System.out.println("Задание номер 5"); // Просто для разграничения информации выводимой в консоль

        for (short number = 100; number <= 1000; number++) {
            if (number % 5 == 0) {
                System.out.println(number);
            }
        }

         /* Внутри метода main напишите цикл(ы) который(е) отображает(ют) в консоль сумму следующей
            серии: 1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 + ... + 95/97 + 97/99
          */

        System.out.println("Задание номер 6"); // Просто для разграничения информации выводимой в консоль

        double s = 0;
        for (double x = 0; x <= 49; x++) {
            s += (2 * x + 1) / (2 * x + 3);
            if (x == 49) {
                System.out.println(s);
            }
        }

         /* Бонус: Используйте комбинацию из System.out.println и System.out.print и циклы на вывода на
            экран следующей фигуры
          */

        System.out.println("Задание номер 7"); // Просто для разграничения информации выводимой в консоль

        int a = 1;
        for (a = 0; a <= 8; a++) {
            System.out.println("");
            for (int j = 0; j <= a; j++)
                System.out.print("*");
        }
    }
}







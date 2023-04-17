package org.example.homework_nr_4;

public class HomeWork4 {

    public static void main(String[] args){

// Задание номер 4
        int[] array = new int[]{10, 2, 13, 11, 4, 7, 12, 6, 23, 3};

        System.out.println("Задание номер 4. Список всех элементов массива array");
        System.out.println(); //Для удобства чтения информации в терминале

        for (int a = 0; a <= array.length; a++) {
            if (a == array.length) break;
            System.out.println(array[a]);
        }

// Задание номер 5


        //Первая часть
        int[] anotherArray = new int[]{1, 22, 12, 7, 55, 13, 4}; //Обьявление одномерного массива anotherArray

        float summ = 0;
        float average = 0;
        for (int b = 0; b <= anotherArray.length; b++) {
            if (b == anotherArray.length) break;
            summ = summ + anotherArray[b];
            average = (summ / anotherArray.length);
        }
        System.out.println("Задание номер 5. Сумма элементов одномерного массива anotherArray");
        System.out.println(summ);
        System.out.println(); //Для удобства чтения информации в терминале
        System.out.println("Задание номер 5. Среднее значение элементов одномерного массива anotherArray");
        System.out.println(average);
        System.out.println(); //Для удобства чтения информации в терминале

        //Вторая часть

        int[][] TwoDimensionalArray = new int[][]{  //Обьявление второго двумерного массива
                {12, 2, 45, 7, 33, 14, 1, 17},
                {44, 27, 7, 8, 39, 4, 9, 141}
        };

        int x = 0; //Количество чётных
        int y = 0; //Количество нечётных
        for (int a = 0; a != TwoDimensionalArray.length; a++) {
            for (int b = 0; b != TwoDimensionalArray[a].length; b++) {
                if (TwoDimensionalArray[a][b] % 2 == 0) {
                    x++;
                } else {
                    y++;
                }
            }
        }
        System.out.println("Задание номер 5. Кол-во чётных и нечётных элементов массива");
        System.out.println("Кол-во чётных элементов " + x);
        System.out.println("Кол-во не чётных элементов " + y);


//Задание номер 6 (Бонусное)

        int f = 0;
        String[] namesArray = new String[]{"John", "Alex", "Bill", "Charlie"}; //Обьявляем первый массив

        String[] anotherNamesArray = new String[namesArray.length]; //Обьявляем второй масив длиной как у первого

        for (int a = 0; a != namesArray.length; a++) {
            anotherNamesArray[f] = namesArray[a];
            f++;

        }
        System.out.println(); //Для удобства чтения информации в терминале
        System.out.println("Задание номер 6");
        System.out.println("Вывод элементов второго массива. Элементы присвоены от первого массива.");

        for (int a = 0; a != anotherNamesArray.length; a++) {
            System.out.println(anotherNamesArray[a]);
        }

    }


}



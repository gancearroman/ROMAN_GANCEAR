package org.example;


public class HomeWork5 {

    public enum Weekday {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY;

        public boolean isWeekDay() {
            if(this != SUNDAY && this != SATURDAY){
                return true;
            }
            return false;
        }

        public boolean isHoliday() {
            if(this != SUNDAY && this != SATURDAY){
                return false;
            }
            return true;
        }
    }
    enum month {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOMBER, NOVEMBER, DECEMBER
    }

    public static void main(String[] args) {


//Вывод в конслоль всех значений списка month. Использовал For each.
        for (month monthValues : month.values())
            System.out.println(monthValues);

//Вывод в консоль всех значений списка month. Использовал For
        month[] months = month.values();
        for (int i = 0; i != months.length; i++) {
            System.out.println(months[i]);
        }

//Преобразовние переменных String
        String a = ("true");
        boolean a1 = Boolean.valueOf(a);

        String b = "120";
        byte b1 = Byte.valueOf(b);

        String c = "32000";
        short c1 = Short.valueOf(c);

        String d = "147895632";
        long d1 = Long.valueOf(d);

        String e = ("987654321987654321");
        long e1 = Long.valueOf(e);

        String f = "4444.5d";
        double f1 = Double.valueOf(f);

        String g = "2354.56f";
        float g1 = Float.valueOf(g);

//  Методы isWeekDay(); isHoliday();
        System.out.println(Weekday.FRIDAY.isWeekDay());
        System.out.println(Weekday.SATURDAY.isHoliday());




    }
}

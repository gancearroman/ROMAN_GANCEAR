package org.example.homework_nr_6;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        if (day <= 0 | day > 31) {
            System.out.println("Date format error. Day value must be 0>day<=31");
        } else {
            this.day = day;
        }

        if (month <= 0 | month > 12) {
            System.out.println("Date format error. Month value must be 0>month<=12");
        } else {
            this.month = month;
        }
        if (year < 2023 | year >= 2050) {
            System.out.println("Date format error. Year value must be 2023>year<=2050");
        }
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day <= 0 | day > 31) {
            System.out.println("Date format error. Day value must be 0>day<=31");
        } else {
            this.day = day;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month <= 0 | month > 12) {
            System.out.println("Date format error. Month value must be 0>month<=12");
        } else {
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 2023 | year >= 2050) {
            System.out.println("Date format error. Year value must be 2023>year<=2050");
        }
        this.year = year;
    }
    void displayDate(){
        System.out.println(this.day +" "+ this.month +" "+ this.year);
    }

    public static void main(String[] args) {

        Date newDate = new Date(12, 9, 2023);

        newDate.setDay(19);
        newDate.setMonth(8);
        newDate.setYear(2024);

        newDate.displayDate();



    }
}


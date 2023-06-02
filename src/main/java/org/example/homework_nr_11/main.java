package org.example.homework_nr_11;

import javafx.beans.binding.MapExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.function.Function;
import java.util.function.Predicate;

import static com.sun.xml.internal.fastinfoset.tools.PrintTable.printVocabulary;

public class main {


    public static Function<String, Integer> quantityOfСonsonants = e -> {
        int count = 0;
        for (int x : e.toCharArray()
        ) {
            if ("BCDFGHJKLMNPQRSTVWXYZ".indexOf(x) >= 0) {
                count++;
            }
        }
        return count;
    };

    public static Function<String, Integer> quantityOfVowels = e -> {
        int count = 0;
        for (int x : e.toCharArray()
        ) {
            if ("AEIOUYA".indexOf(x) >= 0) {
                count++;
            }
        }
        return count;
    };

    public static Function<String, Integer> quantityOfNumbers = e -> {
        int count = 0;
        for (int x : e.toCharArray()
        ) {
            if ("0123456789".indexOf(x) >= 0) {
                count++;
            }
        }
        return count;
    };

    public static Function<String, String> EvenOrOdd = e -> {
        int count = 0;
        String R;
        for (int x : e.toCharArray()
        ) {
            count++;
        }
        if (count % 2 == 0) {
            R = "NULL";
        } else {
            R = String.valueOf(e.charAt(0));
        }
        return R;
    };

    public static Predicate<String> isPalindrom = e -> {

        for (int x = 0, y = e.length() - 1; x != y; x++, y--) {
            if (e.charAt(x) != e.charAt(y)) {
                return false;
            }
        }
        return true;
    };

    public static Predicate<Integer> primeNumber = e -> {

        for (int x = 2; x < e; x++) {
            {
                if (e % x == 0) {
                    return false;
                }
            }
        }
        return true;
    };

    public static void main(String[] args) {


        // Testing functional interfaces
        System.out.println("Testing functional interfaces");
        System.out.println(quantityOfNumbers.apply("md4d5s34s4"));
        System.out.println(quantityOfVowels.apply("anflueyuudnc"));
        System.out.println(quantityOfСonsonants.apply("bvncjfudiod"));
        System.out.println(EvenOrOdd.apply("f354"));
        System.out.println(primeNumber.test(84));
        System.out.println(isPalindrom.test("frorf"));
        System.out.println();
        System.out.println("--------------------------------");


        HashMap<String, String> carNumbers = new HashMap<>();
        carNumbers.put("ACF3JK", "California");
        carNumbers.put("CFH44Y", "Missouri");
        carNumbers.put("1XTX1", "California");
        carNumbers.put("TRMHFJ", "Oklahoma");
        carNumbers.put("KK8HQC3", "KK8HQC3");
        carNumbers.put("TE4AM2", "California");
        carNumbers.put("4J77DF", "Missouri");
        carNumbers.put("AC12JK", "California");
        carNumbers.put("GFG44Y", "Hawaii");
        carNumbers.put("71717", "Idaho");
        carNumbers.put("145223", "Texas");
        carNumbers.put("122H24", "Missouri");
        carNumbers.put("TIM450", "California");
        carNumbers.put("JJ7G51", "Hawaii");

        verify(carNumbers);
        System.out.println("--------------------------------");
        premium2(carNumbers);


    }

    public static void verify(HashMap<String, String> input) {
        System.out.println("Available premium palindrome car number with price");
        input.forEach((number, state) -> {
            if (isPalindrom.test(number)) {
                System.out.println(number + " - " + state + " - price " + " - " + "750$");
            }
        });
    }

    public static void premium2(HashMap<String, String> input) {
        System.out.println("Available premium without letters car number with price");
        input.forEach((number, state) -> {
            if (quantityOfNumbers.apply(number) == 6) {
                System.out.println(number + " - " + state + " - price " + " - " + "350$");


            }
        });
    }


}








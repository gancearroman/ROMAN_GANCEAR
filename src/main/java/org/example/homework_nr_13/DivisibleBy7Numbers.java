package org.example.homework_nr_13;

public class DivisibleBy7Numbers {

    int count = 0;
   public static void countDivisibleBy7Numbers(int inferiorLimit, int superiorLimit) throws InvalidRangeException {

       int count = 0;
        if(inferiorLimit > superiorLimit)
            throw new InvalidRangeException("inferiorLimit is bigger than superiorLimit");

       for( int x = inferiorLimit; x<= superiorLimit; x++){
           if(x % 7 == 0){
               count++;
           }
       }
       System.out.println(count);
   }

    public static void main(String[] args) throws InvalidRangeException {
        countDivisibleBy7Numbers(1, 14);
        countDivisibleBy7Numbers(27, 12);

    }
}

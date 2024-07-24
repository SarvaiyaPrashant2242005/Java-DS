import java.util.*;

public class Practice {
    // Average of 3 numbers
    public static int average(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        return avg;
    }

    // Write a method named isEven that accepts an int argument.
    // The methodshould return true if the argument is even, or false otherwise.
    // Also write a program to test your method.
    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        } else
            return false;

    }

    // Sum of digits
    public static int sumDigits(int n) {
        int sumOfDigits = 0;
        while(n > 0) {
        int lastDigit = n % 10;
        sumOfDigits += lastDigit;
        n /= 10;}
        return sumOfDigits;
        
    }
        

    public static void main(String[] args) {
        int p = 1, q = 90, r = 89;
        double n = 3;
        double u = 45;
        System.out.println("Average of " + p +","+q +","+r+"is : "+average(p, q, r));
        System.out.println(isEven(p));
        System.out.println("Minimum value from " +" and"+90+"is : " + Math.min(p, q));
        System.out.println("Maximum value from " +" and"+90+"is : " + Math.max(p, q));
        System.out.println("Square root of "+ 89+ "is"+ Math.sqrt(r));
        System.out.println(Math.pow(n, u));
        // System.out.println(Math.avg(p,q));
        System.out.println(Math.abs(q));
        System.out.println("sum of digits "+ 89 + "is : " + sumDigits(r));

    }

}

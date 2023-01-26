package exercise3;

import java.math.BigDecimal;

// Ex. 3
public class Ex3Main {
    // Tester of overloaded static methods
    public static void main(String[] args) {
        System.out.println("Ex. 3");
        System.out.println("=====================");

        // 1. call add() with arguments in decimal values
        System.out.println(add(1.0d,0.9d));
        // 2. call add() with arguments in integer values
        System.out.println(add(1,1));
        // 3. call add() with arguments in string
        System.out.println(add("1.1", "2.023456789"));
    }

    // add() with arguments in decimal values
    public static double add(Double firstValue, Double secondValue) {
        System.out.println("Called add function with 2 arguments (Datatype = Double): " +
                firstValue + ", " + secondValue);
        return firstValue + secondValue;
    }

    // add() with arguments in integer values
    public static Integer add(Integer firstValue, Integer secondValue) {
        System.out.println("Called add function with 2 arguments (Datatype = Integer): " +
                firstValue.toString() + ", " +secondValue.toString());
        return firstValue + secondValue;
    }

    // add() with arguments in string
    public static String add(String firstValue, String secondValue) {
        System.out.println("Called add function with 2 arguments (Datatype = String): " +
                firstValue + ", " + secondValue);
        // parse input value from String to Double
        Double firstNumeric = Double.parseDouble(firstValue);
        Double secondNumeric = Double.parseDouble(secondValue);
        // parse result from Double to String
        return Double.toString(Double.sum(firstNumeric, secondNumeric));
    }
}

package edu.trinity;

public class Fibonacci {

    public static int calculate(int i) {
        if (i < 2) return i;
        else return calculate(i - 1) + calculate(i - 2);
    }
}

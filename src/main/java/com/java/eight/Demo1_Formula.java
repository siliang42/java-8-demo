package com.java.eight;

public class Demo1_Formula {

    public static void main(String[] args) {
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }

        };

        System.err.println(formula.calculate(1));
        System.err.println(formula.calculate(4));
        System.err.println(formula.calculate(16));
    }
}

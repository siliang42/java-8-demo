package com.java.eight;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo2_Lambda {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        List<Integer> numbers = Arrays.asList(2, 3, 1, 4);

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });

        for (String name : names) {
            System.out.println(name);
        }

        Collections.sort(numbers, (a, b) -> {return b.compareTo(a);});

        for (Integer number : numbers) {
            System.err.println(number);
        }

    }
}

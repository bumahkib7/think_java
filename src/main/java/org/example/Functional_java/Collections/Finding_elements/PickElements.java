package org.example.Functional_java.Collections.Finding_elements;

import java.util.Arrays;
import java.util.List;

public class PickElements {

    public static void main(String[] args) {
        List<String> friends2 = Arrays.asList("Jim", "Karen", "Bukhari", "Rahmah", "Kibuka", "Nig", "nana", "nabewu");

        final List<String> startsWithN = friends2.stream()
                .filter(name -> name.startsWith("n")).toList();
        System.out.printf("Found %d names%n", startsWithN.size());


        final List<String> containsU = friends2.stream()
                .filter(name -> name.contains("u")).toList();
        System.out.println("All names that start with \"u\" are: " + containsU);
    }
}

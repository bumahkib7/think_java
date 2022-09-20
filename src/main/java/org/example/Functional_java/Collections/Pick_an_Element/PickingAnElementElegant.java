package org.example.Functional_java.Collections.Pick_an_Element;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PickingAnElementElegant {
    public static void pickName(
            final List<String> names, final String letter){
        final Optional<String> foundName = names.stream()
                .filter(name -> name.startsWith(letter))
                .findFirst();

        System.out.printf("A name starting with %s: %s%n",letter, foundName.orElse("No name found"));
        foundName.ifPresent(name -> System.out.println("Hi " + name));
    }

    public static void main(String[] args) {
        List<String> friends2 = Arrays.asList("Jim", "Karen", "Bukhari", "Rahmah", "Kibuka", "Nig", "nana", "nabewu");

        pickName(friends2, "R");

    }
}

package org.example.Functional_java.Collections.reducing_toA_single_value;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PickALongest {
    public static void main(String[] args) {
        List<String> friends2 = Arrays.asList("Jim", "Karen", "Bukhari", "Rahmah", "Kibuka",
                "Nig", "nana", "nabewu");

        System.out.println("Total number of characters in all names: " +
                friends2.stream()
                        .mapToInt(String::length)
                        .sum());


        final Optional<String> aLongName = friends2.stream()
                .reduce((name1, name2) -> name1.length() >= name2.length() ? name1 : name2);
        aLongName.ifPresent(name -> System.out.printf("the longest name: %s%n", name));


        final Optional<String> shortestName = friends2.stream()
                .reduce((name1, name2) -> name1.length() <= name2.length() ? name1 : name2);
        shortestName.ifPresent(name -> System.out.printf("the shortest name: %s%n", name));

        final Optional<String>  findNameLongerThanKaren = Optional.of(friends2.stream().reduce("karen", (name1, name2) ->
                name1.length() < name2.length() ? name1 : name2));
        findNameLongerThanKaren.ifPresent(name -> System.out.printf("the longer name: %s%n", name));


    }


}


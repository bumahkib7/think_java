package org.example.Functional_java.Collections.Transforming_a_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FriendsInUpperCase {

    public static void main(String[] args) {
        List<String> friends2 = Arrays.asList("Jim", "Karen", "Bukhari", "Rahmah", "Kibuka");

        final List<String> upperCaseNames = new ArrayList<>();

        /*for (String name : friends2) {
            upperCaseNames.add(name.toUpperCase());
        }
        System.out.println(upperCaseNames);

         */

        //better way to do it
       // friends2.forEach(name -> upperCaseNames.add(name.toUpperCase()));
       // System.out.println(upperCaseNames);


        //The lambda way which is alot better
        friends2.stream().map(String::toUpperCase)
                .forEach(name -> System.out.println(name + " "));
        System.out.println();

        friends2.stream()
                .map(String::length)
                .forEach(System.out::print);
        //using method references




    }
}

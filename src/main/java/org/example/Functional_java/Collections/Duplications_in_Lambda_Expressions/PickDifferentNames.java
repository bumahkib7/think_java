package org.example.Functional_java.Collections.Duplications_in_Lambda_Expressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class PickDifferentNames {
    /*
    let's figure out how to remove duplications

    public static  Predicate<String> checksIfNameStartsWith(final String letter) {
        return name -> name.startsWith(letter);
     }
    */


    public static void main(String[] args) {
        final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

        final Function<String, Predicate<String>> startsWithLetter = letter ->
                name -> name.startsWith(letter);

        //THE FOLLOWING CODE IS CONSIDERED DUPLICATE
        // final Predicate<String> startsWithN = name -> name.startsWith("N");
        // final Predicate<String> startsWithB = name -> name.startsWith("B");
        // final long countFriendsStartN = friends.stream().filter(startsWithN).count();
        // final long countFriendsStartB = friends.stream().filter(startsWithB).count();

        //LET'S SEE HOW WE CAN MAKE IT MORE EFFICIENT AND MORE READABLE
        final long countFriendsStartN = friends.stream().filter(startsWithLetter.apply("N")).count();
        final long countFriendsStartB = friends.stream().filter(startsWithLetter.apply("B")).count();

        System.out.println(countFriendsStartN);
        System.out.println(countFriendsStartB);

        /*
         but what if we don't want to populate our class with static methods

         final Function<String, Predicate<String>> startsWithLetter = (String letter) -> {
             Predicate<String> checkStarts = (String name) -> name.startsWith(letter);
             return checkStarts;
         };

        */


    }
}

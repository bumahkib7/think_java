package org.example.Functional_java.Collections.Reusing_Lambda_Expressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PickElementsMultipleCollection {
    public static void main(String[] args) {

        final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

        final List<String> editors = Arrays.asList("Brian", "Jackie", "John", "Mike");

        final List<String> comrades = Arrays.asList("Kate", "Ken", "Nick", "Paula", "Zach");

        /* // this is considered spaghetti code
        final long countFriendsStartN = friends.stream().filter(name -> name.startsWith("N")).count();
        final long countEditorsStartN = editors.stream().filter(name -> name.startsWith("N")).count();
        final long countComradesStartN = comrades.stream().filter(name -> name.startsWith("N")).count();
         */

        final Predicate<String> startsWithN = name -> name.startsWith("N");
        final Predicate<String> endsWithN = name -> name.endsWith("n");
        final long friendsCounter = friends.stream().
                filter(startsWithN).count();

        final long editorsNCounter = editors.stream().
                filter(startsWithN).count();

        final long comradesCounter = comrades.stream().
                filter(startsWithN).count();

        System.out.println(startsWithN);
        System.out.println(friendsCounter);
        System.out.println(editorsNCounter);
        System.out.println(comradesCounter);

        System.out.println("-------------------------------");

        final long friendsCounterEnd = friends.stream().
                filter(endsWithN).count();

        final long editorsNCounterEnd = editors.stream().
                filter(endsWithN).count();

        final long comradesCounterEnd = comrades.stream().
                filter(endsWithN).count();

        System.out.println(friendsCounterEnd);
        System.out.println(comradesCounterEnd);
        System.out.println(editorsNCounterEnd);
    }
}

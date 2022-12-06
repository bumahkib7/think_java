package org.example.Functional_java.Strings_Comparators_and_Filters.Comparator_Interface_2;

import java.util.List;

public class OlderThan20 extends Person {

    public OlderThan20(String theName, int theAge) {
        super(theName, theAge);
    }

    public static void main(String[] args) {
        List<Person> olderThan20 = people.stream()
                .filter(person -> person.getAge() > 20).toList();
        System.out.println("People older than 20: " + olderThan20);
    }
}

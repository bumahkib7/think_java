package org.example.Functional_java.Strings_Comparators_and_Filters.Comparator_Interface_2;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Person {

    private final String name;
    private final int age;

    public Person(final String theName, final int theAge) {
        name = theName;
        age = theAge;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int ageDifference(final Person other) {
        return age - other.age;
    }

    public String toString() {
        return String.format("%s - %d", name, age);
    }

    static final List<Person> people = Arrays.asList(new Person("John", 20),
            new Person("Sara", 21),
            new Person("Jane", 21),
            new Person("Greg", 35),
            new Person("Zungululu", 21),
            new Person("Alifu", 10));


    public static void main(String[] args) {



        printPeople("Sorted in ascending order by age: ", people.stream()
                .sorted(Person::ageDifference)
                .collect(toList()));

        Comparator<Person> compareAscending = Person::ageDifference;
        Comparator<Person> compareDescending = compareAscending.reversed();


        printPeople("Sorted in descending order by age " , people.stream().sorted(compareDescending).collect(Collectors.toList()));

        printPeople("Sorted people in Alphabetical order", people.stream()
                .sorted(Comparator.comparing(Person::getName)).collect(Collectors.toList()));

        printPeople("Alphabetical Descending order", people.stream()
                .sorted(Comparator.comparing(Person::getName).reversed()).collect(Collectors.toList()));

        //youngest

        printPeople("The youngest person in the list is:", people.stream()
                .min(Person::ageDifference).stream().toList());

        printPeople("The Oldest person in the list is:", people.stream()
                .max(Person::ageDifference).stream().toList());
    }

    private static void printPeople(String s, List<Person> collect) {
        System.out.println(s);
        collect.forEach(System.out::println);
    }


}

package org.example.NON;

import java.sql.Time;
import java.util.HashMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.util.Arrays.binarySearch;

public class Watch {

    private Time time;

    public Watch(Time time) {
        this.time = time;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public static void sayHello(String Greeting) {
        Greeting = "Hello";
    }

    public static void main(String[] args) {

        HashMap<String, Integer> names = new HashMap<>();

        Stream.of("John", "Paul", "George", "Ringo")
                .iterator().forEachRemaining(name -> names.put(name, name.length()));

        System.out.println(names);
    }
}
package org.example.Functional_java.Collections.iterating_over_Collections_1;

import java.util.Arrays;
import java.util.List;

public class Friends {
    public static void main(String[] args) {


        List<String> friends2 = Arrays.asList("Jim", "Karen", "Bukharin", "Rahman", "Kabuki");

        //verbose code
        /*friends2.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/

        //better way than the first one
        //friends2.forEach((final String name) -> System.out.println(name));

        //better way than the second
       // friends2.forEach( (name) -> System.out.println(name));


        //3rd way
        //friends2.forEach(name -> System.out.println(name));

        //4th way
        friends2.forEach(System.out::println);



    }
}

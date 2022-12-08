package org.example.JavaTheHardWay;

import java.util.Locale;
import java.util.stream.IntStream;

public class ArrayIntro {
  public static void main(String[] args) {
    String[] Planets = {
      "Mercury", "Venus", "Earth", "Mars",
      "Jupiter", "Saturn", "Uranus", "Neptune"};

    for (String p : Planets) {
      System.out.println(p + "\t" + p.toUpperCase(new Locale("en")));
    }

    String[] names = {
      "Bukhari", "Kayena", "Kibuka", "Tyrdal", "Mahmoud"
    };

    IntStream.range(0, names.length).forEach(x -> {
      System.out.println(names[x]);
      for (String name : names) {
        System.out.println(name + "\t" + name.toUpperCase());
      }
    });

    IntStream.range(0, Planets.length).forEachOrdered(
      x -> {
        System.out.println(Planets[x].toUpperCase());
      }
    );



  }
}

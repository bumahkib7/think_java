package org.example.Functional_java.Strings_Comparators_and_Filters.Iterate_A_String_1;

public class IterateString {

    private static void printChar(int aChar){
        System.out.println((char) (aChar));
    }

    public static void main(String[] args) {
        final String str = "Bukhari";

        str.chars()
                .forEach(IterateString::printChar);
    }
}

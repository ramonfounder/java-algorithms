package me.jramun.jalgorithms.string;

import java.util.Arrays;

public class MyStrings {

    public static boolean isUppercase(String s) {
        return s.chars().allMatch(Character::isUpperCase);
    }


    public static boolean isLowercase(String s) {
//        s.chars().noneMatch(Character::isDigit);
        return s.chars().allMatch(Character::isLowerCase);
    }

    public static boolean passwordComplex(String s) {
        return s.chars().anyMatch(value -> Character.isUpperCase(value) || Character.isLowerCase(value) || Character.isDigit(value));
        //another way
        //return s.chars().anyMatch(Character::isDigit) && s.chars().anyMatch(Character::isUpperCase) && s.chars().anyMatch(Character::isLowerCase);
    }

    public static String normalizeString(String s) {
        return s.toLowerCase().trim().replace(",", "");
    }

    public static void parseContents(String s) {
        System.out.println("Option 1");
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println(c);
        }

        System.out.println();
        System.out.println("Option 2");
        for (char c : s.toCharArray()) {
            System.out.println(c);
        }
    }

    public static String reverse(String s) {
        //Option 1
//        if (s == null || s.isEmpty()) return "";
//        StringBuilder reverse = new StringBuilder();
//        for (int i = s.length() - 1; i >= 0; i--) {
//            reverse.append(s.charAt(i));
//        }
//        return reverse.toString();
        //Option 2
        StringBuilder builder = new StringBuilder(s);
        return builder.reverse().toString();
    }

    public static String reverseWord(String s) {
        //Option 1
        String[] array = s.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            builder.append(new StringBuilder(array[i]).reverse());
            if (i != array.length - 1) {
                builder.append(" ");
            }
        }
        return builder.toString();
    }


    public static void main(String[] args) {
        System.out.println(isUppercase("HELLO"));
        System.out.println(isUppercase("HELL0"));
        System.out.println(isLowercase("hello"));
        System.out.println(isLowercase("Hello"));
        System.out.println(normalizeString("   Hello ,BABY "));
        System.out.println(reverse("Hello"));
        System.out.println(reverseWord("Hello world I am Mojtaba"));
    }
}

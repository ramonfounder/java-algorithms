package me.jramun.jalgorithms.string;

public class AllOrNothing {

    public static boolean isUppercase(String s) {
        return s.chars().allMatch(Character::isUpperCase);
    }


    public static boolean isLowercase(String s) {
//        s.chars().noneMatch(Character::isDigit);
        return s.chars().allMatch(Character::isLowerCase);
    }


    public static void main(String[] args) {
        System.out.println(isUppercase("HELLO"));
        System.out.println(isUppercase("HELL0"));
        System.out.println(isLowercase("hello"));
        System.out.println(isLowercase("Hello"));
    }
}

package me.jramun.jalgorithms.array;

import java.util.Arrays;

public class MyBinarySearch {

    public static boolean handler(int[] array, int item) {
        int min = 0;
        int max = array.length - 1;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (array[mid] == item) return true;
            else if (array[mid] > item) max = mid - 1;
            else min = mid + 1;
        }
        return false;
    }


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(handler(array, 10));
        System.out.println(Arrays.binarySearch(array, 10));
    }
}

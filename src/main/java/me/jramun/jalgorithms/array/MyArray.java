package me.jramun.jalgorithms.array;

import java.util.Arrays;

public class MyArray {

    public static Integer linerSearch(Integer[] array, Integer item) {
        //Option 1
//        for (int e : array) {
//            if (e == item)
//                return e;
//        }
//        return null;
        //Option 2
        return Arrays.stream(array).filter(x -> x.equals(item)).findFirst().orElse(0);
    }

    public static void reverseInPlace(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int temp = array[array.length - (i + 1)];
            array[array.length - (i + 1)] = array[i];
            array[i] = temp;
        }
    }

    public static void rotateLeft(int[] array) {
        int temp = array[0];
//        for (int i = 1; i < array.length; i++) {
//            array[i - 1] = array[i];
//        }
        System.arraycopy(array, 1, array, 0, array.length - 1);
        array[array.length - 1] = temp;
    }

    public static void rotateRight(int[] array) {
        int temp = array[array.length - 1];
//        for (int i = array.length - 1; i >= 1; i--) {
//            array[i] = array[i - 1];
//        }

//        for (int i = 1; i < array.length; i++) {
//            array[i - 1] = array[i];
//        }
        System.arraycopy(array, 0, array, 1, array.length - 1);
        array[0] = temp;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        rotateRight(array);
        System.out.println(Arrays.toString(array));
    }
}

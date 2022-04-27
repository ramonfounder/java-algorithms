package me.jramun.jalgorithms.queue;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers {

    public static void handler(int n) {
        System.out.println();
        if (n <= 0) {
            return;
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        for (int i = 0; i < n; i++) {
            Integer value = queue.remove();
            System.out.println(value);
            queue.add(value * 10);
            queue.add(value * 10 + 1);
        }

    }

    public static void main(String[] args) {
        handler(5);
    }
}

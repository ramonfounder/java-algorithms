package me.jramun.jalgorithms.stack;

import java.util.Stack;

public class NextGreaterElement {

    public static void handler(int[] array) {
        if (array.length == 0) return;

        Stack<Integer> stack = new Stack<>();
        stack.push(array[0]);
        for (int i = 1; i < array.length; i++) {
            int next = array[i];
            if (!stack.isEmpty()) {
                int popped = stack.pop();
                while (popped < next) {
                    System.out.println(popped + "--->" + next);
                    if (stack.isEmpty()) break;
                    popped = stack.pop();
                }
                if (popped > next) stack.push(popped);
            }
            stack.push(next);
        }
        while (!stack.isEmpty()) System.out.println(stack.pop() + "---> -1");
    }

    public static void main(String[] args) {

        handler(new int[]{16, 7, 2, 15});
    }
}

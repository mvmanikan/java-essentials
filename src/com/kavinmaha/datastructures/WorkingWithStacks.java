package com.kavinmaha.datastructures;

import java.util.Stack;

public class WorkingWithStacks {
    public static void main(String[] args) {
        // 10.06.2021 Last in First Out - LIFO
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack.add(5));
        System.out.println(stack.peek());
        System.out.println(stack);
    }
}

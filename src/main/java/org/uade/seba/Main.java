package org.uade.seba;

import org.uade.seba.stack.staticImpl.StaticStack;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        StaticStack<Integer> stack = new StaticStack<>(10);
        int i = 0;

        while(!stack.isFull()) {
            stack.push(i);
            i++;
        }


        while (!stack.isEmpty())
            stack.pop();

        System.out.println("bye");
    }
}
package org.uade.seba;

import org.uade.seba.queue.staticImpl.StaticQueue;
import org.uade.seba.stack.staticImpl.StaticStack;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        StaticQueue<Integer> queue = new StaticQueue<>(10);
        for (int i = 0; i<10; i++)
            queue.add(i);

        queue.remove();
        System.out.println("bye");
    }
}
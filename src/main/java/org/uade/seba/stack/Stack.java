package org.uade.seba.stack;

public interface Stack<E> {

    E getFirst() throws IllegalAccessException;
    E pop() throws IllegalAccessException;
    void push(E value) throws IllegalAccessException;
    boolean isEmpty();
}

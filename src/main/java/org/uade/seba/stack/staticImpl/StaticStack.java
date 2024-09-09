package org.uade.seba.stack.staticImpl;

import org.uade.seba.stack.Stack;

public final class StaticStack<E> implements Stack<E> {
    private final E[] array;
    private int count;
    private final int capacity;

    private StaticStack()   {
        throw new RuntimeException("Private constructor");
    }

    @SuppressWarnings("unchecked")
    public StaticStack(int size) {
        array = (E[]) new Object[size];
        count = 0;
        capacity = size;
    }

    @Override
    public StaticStack<E> copy() throws IllegalAccessException {
        StaticStack<E> aux1 = new StaticStack<>(this.capacity);
        StaticStack<E> aux2 = new StaticStack<>(this.capacity);

        while (!this.isEmpty()) {
            aux1.push(this.getFirst());
            aux2.push(this.getFirst());
            this.pop();
        }

        while (!aux1.isEmpty()) {
            this.push(aux1.getFirst());
            aux1.pop();
        }

        while (!aux2.isEmpty()) {
            aux1.push(aux2.getFirst());
            aux2.pop();
        }

        return aux1;
    }

    @Override
    public E getFirst() throws IllegalAccessException {
        if (isEmpty())
            throw new IllegalAccessException("Stack is empty");

        return array[count - 1];
    }

    @Override
    public E pop() throws IllegalAccessException {
        if (isEmpty())
            throw new IllegalAccessException("Stack is empty");

        E aux = array[count - 1];
        count--;
        array[count] = null;

        return aux;
    }

    @Override
    public void push(E element) throws IllegalAccessException {
        if (isFull())
            throw new IllegalAccessException("Stack is full");

        array[count] = element;
        count++;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count > capacity - 1;
    }
}

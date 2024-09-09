package org.uade.seba.queue.staticImpl;

import org.uade.seba.queue.Queue;

public final class StaticQueue<E> implements Queue<E> {
    private final int capacity;
    private final E[] array;
    private int count;

    private StaticQueue() {
        throw new RuntimeException("Private constructor");
    }

    @SuppressWarnings("unchecked")
    public StaticQueue(int size) {
        this.array = (E[]) new Object[size];
        this.count = 0;
        this.capacity = size;
    }

    @Override
    public E getFirst() {
        if (isEmpty())
            throw new IllegalArgumentException("Queue is empty");

        return array[0];
    }

    @Override
    public void add(E element) {
        if (isFull())
            throw new IllegalArgumentException("Queue is full");

        this.array[this.count] = element;
        this.count++;
    }

    @Override
    public void remove() {
        if (isEmpty())
            throw new IllegalArgumentException("Queue is empty");

        for (int i = 0; i < this.count - 1; i++)
            this.array[i] = this.array[i + 1];

        this.array[count - 1] = null;
        this.count--;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count > capacity - 1;
    }
}

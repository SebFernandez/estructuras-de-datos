package org.uade.seba.queue;

public interface Queue<E>{

    E getFirst();
    void add(E element);
    void remove();
    boolean isEmpty();
}

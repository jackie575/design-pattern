package com.jackie.common.design_pattern.iterator;

import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {
    private T[] args;
    private int index = 0;

    public ArrayIterator(T[] argTemp) {
        this.args = argTemp;
    }

    @Override
    public boolean hasNext() {
        return index < args.length;
    }

    @Override
    public T next() {
        if (index < args.length) {
            return args[index++];
        } else {
            return null;
        }
    }
}

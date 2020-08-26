package com.jackie.common.design_pattern.iterator;

/**
 * @author Jackie Wu
 * Created on 2020-07-30
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        Integer[] integers = new Integer[10];
        ArrayIterator<Integer> iterator = new ArrayIterator<>(integers);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

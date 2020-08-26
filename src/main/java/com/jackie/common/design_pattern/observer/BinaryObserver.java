package com.jackie.common.design_pattern.observer;

public class BinaryObserver extends Observer {
    @Override
    public void update(Subject subject) {
        System.out.println("Binary String: "
                + Integer.toBinaryString(subject.getState()));
    }
}
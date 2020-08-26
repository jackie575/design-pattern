package com.jackie.common.design_pattern.observer;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        // 创建被观察者
        Subject subject = new Subject();
        // 注册多个“观察者”
        subject.attach(new HexaObserver());
        subject.attach(new OctalObserver());
        subject.attach(new BinaryObserver());

        System.out.println("First state change: 15");
        // “被观察者”状态变更时，会主动通知“观察者”
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
package com.jackie.common.design_pattern.singleton;

public class Singleton5 {
    private Singleton5() {
    }

    public static final Singleton5 getInstance() {
        return SingletonHolder.INSTANCE;
    }
    // 1. 利用ClassLoader的原理
    // 2. 延迟初始化
    private static class SingletonHolder {
        private static final Singleton5 INSTANCE
                = new Singleton5();
    }
}
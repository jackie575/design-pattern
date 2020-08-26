package com.jackie.common.design_pattern.singleton;

public class Singleton3 {
    // 利用ClassLoader的原理，在类加载的过程中初始化单例
    private static Singleton3 instance = new Singleton3();

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        return instance;
    }
}
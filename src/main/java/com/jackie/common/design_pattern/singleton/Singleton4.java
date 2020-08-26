package com.jackie.common.design_pattern.singleton;

public class Singleton4 {
    // volatile 确保“内存可见性”
    private volatile static Singleton4 singleton;
    private Singleton4(){}
    public static Singleton4 getSingleton() {
        if (singleton == null) {
            // 注意同步的是Class<Singleton4>对象的monitor lock
            synchronized (Singleton4.class) {
                if (singleton == null) {
                    singleton = new Singleton4();
                }
            }
        }
        return singleton;
    }  
}
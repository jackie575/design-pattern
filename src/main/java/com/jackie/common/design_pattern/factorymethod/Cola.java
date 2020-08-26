package com.jackie.common.design_pattern.factorymethod;

/**
 * @author Jackie Wu
 * Created on 2020-07-30
 */
public interface Cola {
    void drink();
}
class CocaCola implements Cola {
    @Override
    public void drink() {
        System.out.println("喝 可口可乐");
    }
}
class PesiCola implements Cola {
    @Override
    public void drink() {
        System.out.println("喝 百事可乐");
    }
}

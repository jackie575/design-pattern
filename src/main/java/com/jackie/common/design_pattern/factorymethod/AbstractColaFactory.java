package com.jackie.common.design_pattern.factorymethod;

/**
 * @author Jackie Wu
 * Created on 2020-07-30
 */
public interface AbstractColaFactory {
    // 创建的是“抽象产品”
    Cola createCola();
}
class CocaColaFactory implements AbstractColaFactory {
    @Override
    public Cola createCola() {
        return new CocaCola();
    }
}
class PesiColaFactory implements AbstractColaFactory {
    @Override
    public Cola createCola() {
        return new PesiCola();
    }
}
package com.jackie.common.design_pattern.factorymethod;

/**
 * @author Jackie Wu
 * Created on 2020-08-19
 */
public class FactoryMethodPatternDemo {
    public static void main(String[] args) {
        AbstractColaFactory cocaColaFactory = new CocaColaFactory(); // 可口可乐工厂
        AbstractColaFactory pesiColaFactory = new PesiColaFactory(); // 百事可乐工厂
        Cola cocaCola = cocaColaFactory.createCola(); // 创建 可口可乐，注意Cola接口
        Cola pesiCola = pesiColaFactory.createCola(); // 创建 百事可乐，注意Cola接口
    }
}

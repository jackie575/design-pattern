package com.jackie.common.design_pattern.abstractfactory;

public class FactoryProducer {
   public static AbstractFactory getFactory(String choice) {
      if (choice.equalsIgnoreCase("cola")) {
         return new ColaFactory();
      } else if (choice.equalsIgnoreCase("bottle")) {
         return new BottleFactory();
      } else {
         return null;
      }
   }
   public static void main(String[] args) {
      // 可口工厂
      AbstractFactory colaFactory = FactoryProducer.getFactory("cola");
      // 创建 可口可乐
      Cola cocaCola = colaFactory.createCola("coca");
      // 百事工厂
      AbstractFactory bottleFactory = FactoryProducer.getFactory("bottle");
      // 创建 百事瓶子
      Bottle pesiBottle = bottleFactory.createBottle("pesi");
   }
}
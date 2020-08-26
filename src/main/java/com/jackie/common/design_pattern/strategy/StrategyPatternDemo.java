package com.jackie.common.design_pattern.strategy;

public class StrategyPatternDemo {
   public static void main(String[] args) {
      Context context = new Context(new OperationAdd());    
      System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

      context.setStrategy(new OperationSubtract());
      System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

      Context context2 = new Context(new OperationMultiply());
      System.out.println("10 * 5 = " + context2.executeStrategy(10, 5));
   }
}
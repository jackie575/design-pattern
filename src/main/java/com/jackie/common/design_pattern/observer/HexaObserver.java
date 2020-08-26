package com.jackie.common.design_pattern.observer;

public class HexaObserver extends Observer{

   @Override
   public void update(Subject subject) {
      System.out.println( "Hex String: " 
      + Integer.toHexString( subject.getState() ).toUpperCase() ); 
   }
}
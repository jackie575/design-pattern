package com.jackie.common.design_pattern.observer;

public class OctalObserver extends Observer{
   @Override
   public void update(Subject subject) {
     System.out.println( "Octal String: " 
     + Integer.toOctalString( subject.getState() ) ); 
   }
}
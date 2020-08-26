package com.jackie.common.design_pattern.state.state;

/**
 * @author Jackie Wu
 * Created on 2020-08-20
 */
public class StatePatternDemo {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.gearDown();
        bike.gearUp();
        bike.gearUp();
        bike.gearUp();
        bike.gearUp();
        bike.gearDown();
        bike.gearDown();
        bike.gearDown();
    }
}

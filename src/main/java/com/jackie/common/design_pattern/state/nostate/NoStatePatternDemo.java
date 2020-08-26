package com.jackie.common.design_pattern.state.nostate;

/**
 * @author Jackie Wu
 * Created on 2020-08-20
 */
public class NoStatePatternDemo {
    public static void main(String[] args) {
        BikeNoState bike = new BikeNoState();
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

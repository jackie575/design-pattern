package com.jackie.common.design_pattern.state.state;

public class Bike {
    GearState gearState;
    public Bike(){
        gearState = new FirstGear(this);
    }
    public void gearUp(){
        gearState.gearUp();
    }
    public void gearDown(){
        gearState.gearDown();
    }
}
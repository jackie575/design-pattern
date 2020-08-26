package com.jackie.common.design_pattern.state.state;

public abstract class GearState {
    protected Bike bike;

    GearState(Bike bike) {
        this.bike = bike;
    }

    public abstract void gearUp();

    public abstract void gearDown();
}

class FirstGear extends GearState {
    FirstGear(Bike bike) {
        super(bike);
    }

    @Override
    public void gearUp() {
        System.out.println("Moving Up from FirstGear to SecondGear");
        bike.gearState = new SecondGear(bike);
    }

    @Override
    public void gearDown() {
        System.out.println("Already in the FirstGear - cannot go lower");
    }
}

class SecondGear extends GearState {
    SecondGear(Bike bike) {
        super(bike);
    }

    @Override
    public void gearUp() {
        System.out.println("Moving Up  from SecondGear to ThirdGear");
        bike.gearState = new ThirdGear(bike);
    }

    @Override
    public void gearDown() {
        System.out.println("Moving Down from SecondGear to FirstGear");
        bike.gearState = new FirstGear(bike);
    }
}

class ThirdGear extends GearState {
    public ThirdGear(Bike bike) {
        super(bike);
    }

    @Override
    public void gearUp() {
        System.out.println("Already in the ThirdGear - cannot go higher");
    }

    @Override
    public void gearDown() {
        System.out.println("Moving Down from ThirdGear to SecondGear");
        bike.gearState = new SecondGear(bike);
    }
}
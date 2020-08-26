package com.jackie.common.design_pattern.abstractfactory;

/**
 * @author Jackie Wu
 * Created on 2020-07-30
 */
public interface AbstractFactory {
    Cola createCola(String cola);
    Bottle createBottle(String bottle);
}
class ColaFactory implements AbstractFactory {
    @Override
    public Cola createCola(String cola) {
        if(cola.equalsIgnoreCase("coca")){
            return new CocaCola();
        } else if(cola.equalsIgnoreCase("pesi")){
            return new PesiCola();
        } else {
            return null;
        }
    }
    @Override
    public Bottle createBottle(String bottle) {
        return null;
    }
}
class BottleFactory implements AbstractFactory {
    @Override
    public Cola createCola(String cola) {
        return null;
    }
    @Override
    public Bottle createBottle(String bottle) {
        if(bottle.equalsIgnoreCase("coca")){
            return new CocaBottle();
        } else if(bottle.equalsIgnoreCase("pesi")){
            return new PesiBottle();
        } else {
            return null;
        }
    }
}




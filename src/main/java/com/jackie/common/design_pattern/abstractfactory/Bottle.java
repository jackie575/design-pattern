package com.jackie.common.design_pattern.abstractfactory;

/**
 * @author Jackie Wu
 * Created on 2020-07-30
 */
public interface Bottle {
    void fill();
}
class  CocaBottle  implements Bottle{
    public void fill(){
    }
}
class  PesiBottle  implements Bottle{
    public void fill(){
    }
}

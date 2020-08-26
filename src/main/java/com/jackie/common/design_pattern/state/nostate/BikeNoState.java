package com.jackie.common.design_pattern.state.nostate;

/**
 * @author Jackie Wu
 * Created on 2020-08-20
 *
 * 不采用状态模式的例子，if else 非常多！！
 */
public class BikeNoState {
    private GearState2 gearState;

    public BikeNoState() {
        gearState = GearState2.FIRST_GEAR;
    }

    // 升档
    // 手写这么多if else，容易出错！
    // 后续再添加多几个档位，if else爆炸
    public void gearUp() {
        // 根据当前所处的档位，判定是否允许“升档”，执行对应操作
        if (gearState == GearState2.THIRD_GEAR) {
            // 最高档，不允许升档
            System.out.println("Already in the ThirdGear - cannot go higher");
        } else {
            // 允许升档
            if (gearState == GearState2.FIRST_GEAR) {
                System.out.println("Moving Up from FirstGear to SecondGear");
                this.gearState = GearState2.SECOND_GEAR;
            } else if (
                    gearState == GearState2.SECOND_GEAR) {
                System.out.println("Moving Up  from SecondGear to ThirdGear");
                this.gearState = GearState2.THIRD_GEAR;
            }
        }
    }

    public void gearDown() {
        // 根据当前所处的档位，判定是否允许“降档”，执行对应操作
        if (gearState == GearState2.FIRST_GEAR) {
            // 最高档，不允许升档
            System.out.println("Already in the FirstGear - cannot go lower");
        } else {
            // 允许升档
            if (gearState == GearState2.SECOND_GEAR) {
                System.out.println("Moving Down from SecondGear to FirstGear");
                this.gearState = GearState2.FIRST_GEAR;
            } else if (
                    gearState == GearState2.THIRD_GEAR) {
                System.out.println("Moving Down from ThirdGear to SecondGear");
                this.gearState = GearState2.SECOND_GEAR;
            }
        }
    }

}

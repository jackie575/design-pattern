package com.jackie.common.design_pattern.state.nostate;

import java.util.stream.Stream;

/**
 * @author Jackie Wu
 * Created on 2020-08-20
 */
public enum GearState2 {
    FIRST_GEAR,
    SECOND_GEAR,
    THIRD_GEAR;

    public static void main(String[] args) {
        Stream<String > stream = Stream.of(null,"","xxxx","abc");
        System.out.println(stream.findFirst());
    }
}



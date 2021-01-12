package com.tca.designpattern.creation.build;

import lombok.Data;

/**
 * @author zhoua
 * @Date 2021/1/12
 */
@Data
public abstract class AbstractHouseBuilder {

    private House house = new House();

    abstract void buildBase();

    abstract void buildWall();

    abstract void buildRoof();

    public House createHouse() {
        return house;
    }
}

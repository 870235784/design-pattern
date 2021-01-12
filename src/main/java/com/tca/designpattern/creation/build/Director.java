package com.tca.designpattern.creation.build;

/**
 * @author zhoua
 * @Date 2021/1/12
 */
public class Director {

    private AbstractHouseBuilder houseBuilder;

    public Director(AbstractHouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House createHouse() {
        houseBuilder.buildBase();
        houseBuilder.buildWall();
        houseBuilder.buildRoof();
        return houseBuilder.createHouse();
    }
}

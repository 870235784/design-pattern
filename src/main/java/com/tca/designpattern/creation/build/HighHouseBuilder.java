package com.tca.designpattern.creation.build;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zhoua
 * @Date 2021/1/12
 */
@Slf4j
public class HighHouseBuilder extends AbstractHouseBuilder {

    @Override
    public void buildBase() {
        log.info("high house building base...");
    }

    @Override
    public void buildWall() {
        log.info("high house building wall...");
    }

    @Override
    public void buildRoof() {
        log.info("high house building roof...");
    }

}

package com.tca.designpattern.creation.build;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zhoua
 * @Date 2021/1/12
 */
@Slf4j
public class CommonHouseBuilder extends AbstractHouseBuilder {

    @Override
    public void buildBase() {
        log.info("common house building base...");
    }

    @Override
    public void buildWall() {
        log.info("common house building wall...");
    }

    @Override
    public void buildRoof() {
        log.info("common house building roof...");
    }
}

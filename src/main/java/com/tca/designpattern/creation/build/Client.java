package com.tca.designpattern.creation.build;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zhoua
 * @Date 2021/1/12
 */
@Slf4j
public class Client {

    public static void main(String[] args) {
        Director director = new Director(new CommonHouseBuilder());
        House house = director.createHouse();
        log.info("house = {}", house);
    }
}

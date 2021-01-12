package com.tca.designpattern.creation.factory.abstractfactory03;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zhoua
 * @Date 2021/1/9
 */
@Slf4j
public class OrderPizza {

    public static void main(String[] args) {
        PizzaHutFactory pizzaHutFactory = new PizzaHutFactory();
        AbstractPizza pizza = pizzaHutFactory.createPizza(PizzaTypeEnum.CHEESE);
        log.info("pizza = {}", pizza);

    }
}

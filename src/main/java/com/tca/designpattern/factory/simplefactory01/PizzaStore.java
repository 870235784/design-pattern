package com.tca.designpattern.factory.simplefactory01;

import lombok.extern.slf4j.Slf4j;


/**
 * @author zhouan
 * @Date 2021-01
 */
@Slf4j
public class PizzaStore {

	public static void main(String[] args) {
		AbstractPizza cheesePizza = SimplePizzaFactory.createPizza(PizzaTypeEnum.CHEESE);
		log.info("pizza = {}", cheesePizza);
	}
}

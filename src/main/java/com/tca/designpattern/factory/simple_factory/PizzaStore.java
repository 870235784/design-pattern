package com.tca.designpattern.factory.simple_factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PizzaStore {

	public static void main(String[] args) {
		AbstractPizza cheesePizza = SimplePizzaFactory.createPizza(PizzaTypeEnum.CHEESE);
		log.info("pizza = {}", cheesePizza);
	}
}

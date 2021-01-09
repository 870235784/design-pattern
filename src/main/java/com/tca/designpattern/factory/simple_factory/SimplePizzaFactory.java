package com.tca.designpattern.factory.simple_factory;

public class SimplePizzaFactory {
	
	private SimplePizzaFactory() {}
	
	public static AbstractPizza createPizza(PizzaTypeEnum type) {
		if (type == PizzaTypeEnum.CHEESE) {
			return new CheesePizza();
		}
		if (type == PizzaTypeEnum.CLAM) {
			return new ClamPizza();
		}
		return null;
	}
}

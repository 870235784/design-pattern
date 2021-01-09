package com.tca.designpattern.factory.simplefactory01;


/**
 * @author zhouan
 * @Date 2021-01
 */
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

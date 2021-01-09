package com.tca.designpattern.factory.simple_factory;

public class CheesePizza extends AbstractPizza{

	private static final PizzaTypeEnum type = PizzaTypeEnum.CHEESE;
	
	@Override
	protected void box() {
		
	}

	@Override
	protected void cut() {
		
	}

	@Override
	protected void bake() {
		
	}

	@Override
	protected void prepare() {
		
	}

	@Override
	public String type() {
		return type.getName();
	}

}

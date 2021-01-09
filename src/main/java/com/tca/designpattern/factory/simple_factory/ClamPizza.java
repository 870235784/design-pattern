package com.tca.designpattern.factory.simple_factory;

public class ClamPizza extends AbstractPizza{
	
	private static final PizzaTypeEnum type = PizzaTypeEnum.CLAM;

	@Override
	public String type() {
		return type.getName();
	}

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

}

package com.tca.designpattern.creation.factory.simplefactory01;


/**
 * @author zhouan
 * @Date 2021-01
 */
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

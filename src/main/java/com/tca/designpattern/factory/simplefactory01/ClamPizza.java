package com.tca.designpattern.factory.simplefactory01;


/**
 * @author zhouan
 * @Date 2021-01
 */
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

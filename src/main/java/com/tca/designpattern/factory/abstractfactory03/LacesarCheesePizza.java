package com.tca.designpattern.factory.abstractfactory03;


import lombok.Data;

/**
 * @author zhouan
 * @Date 2021-01
 */
@Data
public class LacesarCheesePizza extends AbstractPizza {

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

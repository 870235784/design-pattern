package com.tca.designpattern.creation.factory.factorymethod02;


import lombok.Data;

/**
 * @author zhouan
 * @Date 2021-01
 */
@Data
public class LacesarClamPizza extends AbstractPizza {

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

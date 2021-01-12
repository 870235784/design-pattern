package com.tca.designpattern.creation.factory.factorymethod02;

import lombok.Getter;


/**
 * @author zhouan
 * @Date 2021-01
 */
@Getter
public enum PizzaTypeEnum {
	
	CHEESE(0, "cheese"), CLAM(1, "clam"), VEGGIE(2, "veggie");
	
	private int index;
	
	private String name;
	
	PizzaTypeEnum(int index, String name) {
		this.index = index;
		this.name = name;
	}

}

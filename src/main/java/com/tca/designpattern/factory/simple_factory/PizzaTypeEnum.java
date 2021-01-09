package com.tca.designpattern.factory.simple_factory;

import lombok.Getter;

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

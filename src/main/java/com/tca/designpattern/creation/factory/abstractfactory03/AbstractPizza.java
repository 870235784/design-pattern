package com.tca.designpattern.creation.factory.abstractfactory03;

/**
 * @author zhouan
 * @Date 2021-01
 */
public abstract class AbstractPizza implements IPizza {
	
	/**
	 * 模板方法模式
	 */
	public void cook() {
		prepare();
		bake();
		cut();
		box();
	}

	protected abstract void box();

	protected abstract void cut();

	protected abstract void bake();

	protected abstract void prepare();
	
}

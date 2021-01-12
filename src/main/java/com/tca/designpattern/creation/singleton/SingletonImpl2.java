package com.tca.designpattern.creation.singleton;

/**
 * 饿汉式(跟1类似)
 * @author zhoua
 * 缺陷：
 * 	可能造成内存浪费(如果当前实例不需要使用)
 *
 */
public class SingletonImpl2 {

	private SingletonImpl2(){}
	
	private static final SingletonImpl2 INSTANCE;

	static {
		INSTANCE = new SingletonImpl2();
	}
	
	public SingletonImpl2 getInstance() {
		return INSTANCE;
	}
}

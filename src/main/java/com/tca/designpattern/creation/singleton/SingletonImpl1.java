package com.tca.designpattern.creation.singleton;

/**
 * 饿汉式
 * @author zhoua
 * 缺陷：
 * 	可能造成内存浪费(如果当前实例不需要使用)
 *
 */
public class SingletonImpl1 {
	
	private SingletonImpl1(){}
	
	private static final SingletonImpl1 INSTANCE = new SingletonImpl1();
	
	public SingletonImpl1 getInstance() {
		return INSTANCE;
	}
}
